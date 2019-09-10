package algorithm_java7;

import java.util.Scanner;

public class HappyOrSad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String result="";
		
		char [] arr = word.toCharArray();
		int happy = 0 ;
		int sad = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i]==':' && arr[i+1]=='-') {
				if(arr[i+2]==')') {
					happy++;
				} else if(arr[i+2]=='(') {
					sad++;
				}
			}
		}
		
		if(happy==sad && happy==0) {
			result="none";
		} else if(sad<happy) {
			result="happy";
		} else if(sad>happy) {
			result="sad";
		} else if(happy==sad) {
			result="unsure";
		}
		
		System.out.println(result);
	}

}
