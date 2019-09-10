import java.util.Arrays;
import java.util.Scanner;

public class P1032 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		
		String wordArr [] = new String[testCase];
		for(int i=0; i<testCase; i++) {
			wordArr[i]=scanner.nextLine();
		
		}
		char charArr[] = wordArr[0].toCharArray();
		
		for(int k=1; k<testCase; k++) {
			for(int j=0; j<charArr.length; j++) {
				if(wordArr[k].charAt(j)!=charArr[j]) {
					charArr[j]='?';
				}	
			}
			
		}
		
		for(int j=0; j< charArr.length; j++) {
			System.out.print(charArr[j]+"");
		}
		
		
		
	}

}
