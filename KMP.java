package algorithm_java7;

import java.util.Scanner;

public class KMP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word =scanner.nextLine();
		char [] arr = word.toCharArray();
		String result="";
		result+=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]=='-' ) {
				result+=arr[i];
			}
		}
		System.out.println(result);

	}

}
