import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase= Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<testCase; i++) {
			String scores = scanner.nextLine();
			int score=0;
			int totalscore=0;
			
			char [] scoreArr = scores.toCharArray();
			boolean isO = false;
			for(int j=0; j<scores.length(); j++) {
				if(scoreArr[j]=='O') {
					if(isO==false) {
						score=1;
					} else {
						score++;
					}
					isO=true;
				} else {
					score=0;
					isO=false;
				}
				
				totalscore+=score;
			}
			
			System.out.println(totalscore);
			
		}

	}

}
