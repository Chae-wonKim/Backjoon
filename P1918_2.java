import java.util.Scanner;
import java.util.Stack;

public class P1918_2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String formula = scanner.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
	
		
		
		
		
		
		String result="";
		
		
		for(int i=0; i<formula.length(); i++) {
			char partial = formula.charAt(i);
			
			if(partial=='(') {
				stack.push(partial);
			} else if(partial>='A' && partial <='Z') {
				result+=stack.pop();
			} else if(partial =='+' || partial =='-') {
				while(!stack.isEmpty()) {
					if(stack.peek()=='*' || stack.peek()=='/') {
						result+=stack.pop();
					} else if(stack.peek()=='(') {
						stack.pop();
						break;
					} 
				}
				stack.push(partial);
			} else if(partial=='*' || partial =='/') {
				stack.push(partial);
			} else if(partial==')') {
				while(!stack.isEmpty() ) {
					if(stack.peek()!='(') {
						result+=stack.pop();	
					} else {
						break;
					}
				}
				if(!stack.isEmpty()) stack.pop();
			}
		}
		if(!stack.isEmpty()) {
			result+=stack.pop();
		}
		
		System.out.println(result);

	}

}
