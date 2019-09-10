import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P10845 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine());
		Queue<Integer> que = new LinkedList<>();
		int lastNum=-1;
		
		for(int i=0; i<testCase; i++) {
			String command = scanner.nextLine();	
			if(command.indexOf("push")>=0) {
				lastNum=Integer.parseInt(command.split(" ")[1]);
				que.offer(lastNum);
			}
			
			switch(command) {
			case "pop" : 
				if(!que.isEmpty()) {
					System.out.println(que.poll()); break;	
				} else {
					System.out.println(-1); break;
				}
				
			case "size" : System.out.println(que.size()); break;
			case "empty" : 
				if(!que.isEmpty()) {
					System.out.println(0); break;	
				} else {
					System.out.println(1); break;
				}
				
			case "back" : 
				if(!que.isEmpty()) {
					System.out.println(lastNum); break;
				} else {
					System.out.println(-1); break;
				}
				
			case "front" : 
				if(!que.isEmpty()) {
					System.out.println(que.peek()); break;	
				} else {
					System.out.println(-1); break;
				}
				
				
			
			}
		}

	}
	
	

}


