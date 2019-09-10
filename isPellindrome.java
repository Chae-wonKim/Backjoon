package algorithm_java7;

import java.util.Scanner;

public class isPellindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char [] arr= word.toCharArray();
		boolean isPellin = true;
		
			for(int i=0; i<word.length()/2; i++) {
				if(arr[i]!=arr[word.length()-1-i]) {
					isPellin = false;
					break;
				}
			}
		
		if(isPellin==true) {
			System.out.println(1);
		} else System.out.println(0);

	}

}
