/*
 * 
 * 괄호 문자열은 다음과 같이 정의 한다.

빈 문자열은 괄호 문자열이다.
S가 괄호 문자열일 때, (S)도 괄호 문자열이다.
S와 T가 괄호 문자열이라면, ST도 괄호 문자열이다.
모든 괄호 문자열은 위의 3개 규칙으로만 만들 수 있다.
이 문제에서는 괄호 문자열이 아닌 문자열이 나온다. 만약 문자열이 ‘(‘와 ‘)’로만 이루어져 있고, 괄호 문자열이 아니라면, 그 문자열을 괄호ㄴㄴ문자열이라고 한다.

길이가 N인 괄호ㄴㄴ문자열 중에 사전순으로 K번째인 문자열을 출력하는 프로그램을 작성하시오. 그러한 것이 없으면 -1을 출력한다. ‘(‘가 ‘)’보다 사전순으로 앞선다.

입력
첫째 줄에 N과 K가 주어진다. N은 50보다 작거나 같은 자연수이고, K는 2^N-1보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 문제의 정답을 출력한다.
 */


package algorithm_java7;

import java.util.Scanner;

public class Problem1023 {

	public static void main(String[] args) {
		//(  --A
		//) --B
		// ((((     AAAA 1111    
		// ((()		AAAB 괄호 1112  1
		// (()(	    AABA 1121     2
		// (())		AABB 괄호 1122  1
		// ()((		ABAA 1211     3
		// ()()		ABAB 괄호 1212   1
		// ())(		ABBA 1221      2
			//		ABBB 1222       1
			//		BAAA 2111		4 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = Integer.parseInt(str.split(" ")[0]);
		int dicNum = Integer.parseInt(str.split(" ")[1]);
		String start="";
		
		int maxdic= changeBinary("1111");
		System.out.println(maxdic);
		
		
		
		

	}
	
	public static int changeBinary(String s) {
		char [] arr= s.toCharArray();
		int finalnum=0;
		for(int i=s.length()-1; i>=0; i--) {
			arr[i]+=0;
			arr[i]*=Math.pow(2, s.length()-1-i);
			finalnum+=arr[i];
		}
		return finalnum;
	}


}
