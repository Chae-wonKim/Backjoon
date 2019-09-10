import java.util.Scanner;
import java.util.Stack;

public class P1918_3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String formula = scanner.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		String result="";
		
		
		for(int i=0; i<formula.length(); i++) {
			char c =formula.charAt(i);
		
		if(c=='(') {
			stack.push(c);
		} else if(c=='+' || c=='-') {
			while(!stack.isEmpty() && stack.peek()!='(') {
				result+=stack.pop();
			}
			stack.push(c);
			
		} else if(c=='*' || c=='/') {
			while(!stack.isEmpty() &&(stack.peek()=='/' || stack.peek() =='*')) {
				result+=stack.pop();
			}
			stack.push(c);
		
		} else if(c>='A' && c<='Z') {
			result+=c;
		} else if(c==')') {
			while(true) {
				if(stack.peek()=='(') {
					stack.pop();
					break;
				}
				result+=stack.pop();
			}
			
			
		}
		
		
		
		}	

		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		
		System.out.println(result);	
	}

}
