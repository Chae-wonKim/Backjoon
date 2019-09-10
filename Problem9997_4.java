package algorithm_java7;

import java.util.Scanner;

public class Problem9997_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		String regex = scanner.nextLine();
		
		String A= regex.substring(0, regex.indexOf("*"));
		String B= regex.substring(regex.indexOf("*")+1);
		String result="";
		
		for (int i = 0; i < testCase; i++) {
			String word = scanner.nextLine();
			result="DA";
			if(word.length()==1) {
				result="NE";
			} else {
				int A_index = word.indexOf(A);
				int B_index = word.indexOf(B);
				
				
				if(A_index!=0 ) {
					result="NE";
				} else {
						word = word.replaceFirst(A, "");
						word=word.replace(B, "-");
					if(word.charAt(word.length()-1)!='-') {
						result="NE";
					} else result="DA";
				}
					
			}
			
			System.out.println(result);
		}
	}

}
