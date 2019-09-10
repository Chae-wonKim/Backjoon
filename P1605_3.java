package algorithm_java7;

import java.util.Scanner;

public class P1605_3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());
		String word= scanner.nextLine();
		int maxLength=0;
	
		
		String substr;
		for(int i=0; i<length-1; i++) {
			for(int j=i+maxLength;j<length;j++) {
				substr = word.substring(i, j);
				
				if(word.lastIndexOf(substr)>i && substr.length()>maxLength) {
					maxLength= substr.length();
				}
			}
		}
		System.out.println(maxLength);

	}

}
