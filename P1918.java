import java.util.Scanner;
import java.util.Stack;

public class P1918 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String formula = scanner.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		String result="";
		
		
		for(int i=0; i<formula.length(); i++) {
			char c =formula.charAt(i);
			
			if('A'<=c && 'Z'>=c) {
				result+=c;
			}
			
			switch(c) {
			case '(': stack.push(c); break;
			case '*':
			case '/': stack.push(c); break;
			
			case '+':
			case '-': 
				if(stack.isEmpty()) {
					stack.push(c); break;
				} else if(!stack.isEmpty() ) {
					if(stack.peek()=='(' || stack.peek()=='+' || stack.peek()=='-' ||stack.peek()==')') {
						stack.push(c);
					} else if(stack.peek()=='*' || stack.peek()=='/') {
						while(true) {
							if(stack.peek()=='(' || stack.isEmpty()) break;
 							result+=stack.pop();
						}
						stack.push(c);
					}
				}
				break;
			case ')':
				while(true) {
					if(stack.peek()=='(') {
						stack.pop();
						break;
					} else {
						result+=stack.pop();
					}	
				}
				break;
				}
								
			
			
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		System.out.println(result);		
		
// (A+B)*(C*D+(E+F))
		
//AB+CD*EF++*
	}

}
//(A/B*C)-D*(F-E)
//ABC*/DFE-*-