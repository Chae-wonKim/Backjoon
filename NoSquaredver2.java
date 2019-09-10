package algorithm_java7;

import java.util.Arrays;
import java.util.Scanner;

public class NoSquaredver2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String section= scanner.nextLine();
		
		long min = Long.parseLong(section.split(" ")[0]);
		long max = Long.parseLong(section.split(" ")[1]);
		
		boolean [] result = new boolean[(int)(max-min+1)];
		
		//제곱수는 2부터 시작한다 : 2의 제곱, 3의제곱... 최대제곱수가 입력받은 최대 수보다 커지면 멈춘다.
		for(long i=2; i*i<=max; i++) {
			long power =i*i; //100 10000
			//power=4
			long start=0;
			if( min % power == 0 ) {
				start = min / power;
			} else {
				start = min / power + 1;
			}
			//100 10000
			//2 3 4 ... 100
			//4 9 16... 10000
			// 4*25 4*26 .... 4*250 < - TRUE
			// index[0] id
		
			//구한 몫부터 제곱수*몫이 입력받은 최댓값보다 같거나 작을때만
			//25 250
			for( long j= start; j*power<=max; j++) {
				result[(int)(power*j-min)]= true;
			}
		}
		int count=0;
		for(boolean b: result) {
			if(b==false) count++;
		}
		System.out.println(count);

	}

}
