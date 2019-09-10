package algorithm_java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		List<String> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			String carNum = scanner.nextLine();
			list1.add(carNum);
			
		}
		for(int j=0; j<n;j++) {
			String carNum2=scanner.nextLine();
			list2.add(carNum2);
		}
		
		int count=0;
		for(String st: list1) {
			if(list2.indexOf(st)<list1.indexOf(st)) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
