package algorithm_java7;

import java.util.Arrays;
import java.util.Scanner;

public class countStr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr = str.split(" ");
		int count=0;
		for(String a: arr) {
			if (!a.equals("")) count++;
		}
		System.out.println(count);


	}

}
