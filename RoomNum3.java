package algorithm_java7;

import java.util.Arrays;
import java.util.Scanner;

public class RoomNum3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		
		
		if(n.indexOf("9")>=0) {
			n=n.replaceAll("9", "6");
		}
		
		char [] arr= n.toCharArray();
		Arrays.sort(arr);
	
		int countSix=0;
		for(char a: arr) {
			if(a=='6') countSix++;
		}
		
		for(int i=0; i<countSix/2; i++) {
			n=n.replaceFirst("6", "");
		}

		arr= n.toCharArray();
		Arrays.sort(arr);
		
		int count=0;
		int maxCount=0;
		for(int i=0; i<arr.length-1; i++) {
			count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) count++;
			}
			count++;
			if(count>maxCount) maxCount =count;
		}
		int set=0;
		set= maxCount;
		
		if(maxCount==0) {
			set=1;
		}
		
		System.out.println(set);

	}

}
