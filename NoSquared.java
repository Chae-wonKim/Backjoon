package algorithm_java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoSquared {

	public static void main(String[] args) {
		// 1 10
		//첫째 줄에 [min,max]구간에 제곱ㄴㄴ수가 몇 개인지 출력한다.
		//2 3 4 5 6 7 8 9
		//제곱 수: 4 9 16 25
		//제곱수 arr
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num1 = Integer.parseInt(str.split(" ")[0]);
		int num2 = Integer.parseInt(str.split(" ")[1]);
		
		int  [] arr= new int[num2-num1+1];
		int index=0;
		for(int j=num1; j<=num2; j++) {
			arr[index] = j;
			index++;
		}
		
		List<Integer> list= new ArrayList<>();
		int i=2;
		while(true) {
			if(i*i>num2) break;
			list.add(i*i);
			i++;
		}
		
		int result=arr.length;
		for(index=0; index<arr.length; index++) {
			for(i=0; i<list.size(); i++) {
				if(arr[index]%list.get(i)==0) {
					result--;
				}
			}
		}
		System.out.println(result);
		
	}
	

}
