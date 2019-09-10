package algorithm_java7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2002_2 {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			que.offer(sc.nextLine());
		}
		
		
		String outNum;
		String inNum;
		int count=0;
		int index=0;
	
		
		String[] outlist = new String[n];
		for(int j=0; j<n; j++) {
			outNum = sc.nextLine();
			outlist[j]=outNum;
			
		}
		
		while(que.isEmpty()) {
			inNum= que.poll();
			for(int k=0;k<n;k++) {
				if(!outlist[k].equals(inNum)) {
					count++;
				} else {
					break;
				}
			}	
		}
	
		
		
		
	}	
		
		

}


