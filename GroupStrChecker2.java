/*
 * 문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.


 */

package algorithm_java7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GroupStrChecker2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int countResult=0;
		
		
		for(int i=0; i<n; i++) {
			//다음 네개의 변수들은 위의 for문이 돌 때마다 초기화되어야한다.
			boolean isGrouped=true;
			String word=scanner.nextLine();
			char wordArr [] = word.toCharArray();
			
			//등장한 알파벳을 담을 리스트
			//set에 있는 단어는 최소 한번 나온 단어들
			Set<Character> set= new HashSet<>();
			
			//단어가 한글자일 경우는 무조건 그룹단어이므로, 한글자 초과인 단어에 대해서만 검사
			if(wordArr.length>1) {
				for(int j=0; j<wordArr.length-1; j++) {
							set.add(wordArr[j]);						
							//그 다음값과 다른 값을 가지는데, 그 단어가 set에 있다.
							//그룹단어가 아님.
							//abcdd
							if(wordArr[j]!=wordArr[j+1]) {
								if(set.contains(wordArr[j+1])) {
									isGrouped=false;
									break;
								} 	
							}
							
				}	
			}
			
			if(isGrouped==true) countResult++;
			
		}
		
		System.out.println(countResult);

	}

}
