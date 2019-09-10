import java.util.Scanner;

public class P9093 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase =Integer.parseInt(scanner.nextLine());
		
		String word="";
		for(int i=0; i<testCase; i++) {
			word = scanner.nextLine();
			String [] wordArr = word.split(" ");
			
			for(int j=0; j<wordArr.length; j++) {
				String space=" ";
				String partWord = wordArr[j];
				wordArr[j]="";
				for(int k=partWord.length()-1; k>=0; k--) {
					wordArr[j]+=partWord.charAt(k);
				}
				
				if(j!=wordArr.length-1) {
					System.out.print(wordArr[j]+space);
				} else {
					System.out.println(wordArr[j]);
				}
				
			}
			
		}

	}

}
