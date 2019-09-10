package algorithm_java7;

import java.util.Scanner;

public class addCycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		int intNum = Integer.parseInt(num);
		
		System.out.println(Cycle(intNum));

	}
	
	public static int Cycle(int number) {
		int result=0;
		int originNumber = number;
		while(true) {
			int first = number/10;
			int second = number%10;
			int third = first+second;
			number= Integer.parseInt(""+second+(third%10));
			result++;
			if(number==originNumber) break;	
		}
		
		return result;
	}

}
