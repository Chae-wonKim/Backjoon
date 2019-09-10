import java.util.Arrays;
import java.util.Scanner;

public class P2979 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fees = scanner.nextLine();
		
		
		//차의 도착 출발 정보를 받음
		String [] cars= new String[3];
		for(int j=0; j<3; j++) {
			cars[j]=scanner.nextLine();
		}
		
		//요금 정보를 받음
		int feeArr []= new int[3];
		for(int i=0; i<3; i++) {
			feeArr[i]= Integer.parseInt(fees.split(" ")[i]);
		}
		
		
		//가장 빨리 들어온 차와 가장 늦게 나간 차 구하기
		int latest=0;
		int earlist=100;
		int arrive=0;
		int depart=0;
		
		for(int k=0; k<3; k++) {
			arrive = Integer.parseInt(cars[k].split(" ")[0]);
			if(arrive<earlist) {
				earlist= arrive;
			}
			//떠난시간
			depart =Integer.parseInt(cars[k].split(" ")[1]);
			if(depart>latest) {
				latest= depart;
			}
		}
		
		int [] timeArr = new int[latest+1];
		
		for(int k=0; k<3; k++) {
			int in = Integer.parseInt(cars[k].split(" ")[0]);
			int out = Integer.parseInt(cars[k].split(" ")[1]);
			
			for(int j=in+1; j<=out;j++) {
				timeArr[j]++;
			}
		}
		
		
		int result=0;
		for(int t=0; t<=latest; t++) {
			if(timeArr[t]==1) {
				result+=feeArr[0];
			} else if(timeArr[t]==2) {
				result+=feeArr[1]*2;
			} else if(timeArr[t]==3) {
				result+=feeArr[2]*3;
			}
		}
		
		System.out.println(result);
		
	}

}


// 0 1 2 3 4 5 6 7 8
// 0 1 1 1 1 1 1 0 0
// 0 0 0 1 1 1 0 0 0
// 0 0 1 1 1 1 1 1 1

// 0 1 2 3 3 3 2 1 1
// 0 5 6 3 3 3 6 5 5 =  36?
