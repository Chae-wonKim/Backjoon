import java.util.Scanner;
import java.util.Stack;

public class P9012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase =Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<testCase; i++) {
			String par = scanner.nextLine();
			char [] arr = par.toCharArray();
			String result="YES";
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j< par.length();j++) {
				
				if(arr[j]=='(') {
					stack.push('(');
				} else if(arr[j]==')') {
					if(stack.isEmpty()) {
						result="NO";
						break;
					} else {
						stack.pop();
					}
					
				}
				
			}
			
			if(!stack.isEmpty()) {
				result="NO";
			} 
			
			System.out.println(result);
		}

	}

}
