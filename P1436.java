package algorithm_java7;

import java.util.Scanner;

public class P1436 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int index=0;
		int i=666;
		
		while(true) {
			String strNum=(i+"");
			if(strNum.indexOf("666")>=0) {
				index++;
			}
			if(index==num) {
				System.out.println(i);
				break;
			}
			i++;
			
		}

	}

}
