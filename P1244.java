import java.util.Scanner;

public class P1244 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int switchNums = Integer.parseInt(scanner.nextLine());
		String switches = scanner.nextLine();
		String [] switchArr = switches.split(" ");
		int stuNum = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<stuNum;i++) {
			String stu = scanner.nextLine();
			String [] stuArr = stu.split(" ");
			String sex = stuArr[0];
			String numStr = stuArr[1];
			int num = Integer.parseInt(numStr);
			
			if(sex.equals("1")) {
				for(int j=0; j<switchNums; j++) {
					if((j+1)%num==0) {
						switchArr[j]=change(switchArr[j]);
					}
				}
			} else if(sex.equals("2")) {
				
				//num-1기준이 되는 수
				int back = num-2;
				int front = num;
				while(true) {
					if(back<0 || front>switchNums-1) break;
					if(!switchArr[back].equals(switchArr[front])) {
						break;
					} else {
						switchArr[back]= change(switchArr[back]);
						switchArr[front] = change(switchArr[front]);
					}
					back--;
					front++;
				}
				switchArr[num-1]=change(switchArr[num-1]);
			}
			
			
				
			}
			

		for(int k=0; k<switchArr.length; k++) {
			if((k>=19 && (k+1)%20==0) ||k==switchArr.length-1) {
				System.out.println(switchArr[k]);
			} else {
				System.out.print(switchArr[k]+" ");
			}
			
		}
		
	}

	public static String change(String num) {
		if (num.equals("0")) {
			return "1";
		} else {
			return "0";
		}
	}

}
