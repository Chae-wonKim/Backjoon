import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2252_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int range = scanner.nextInt();
		int cases = scanner.nextInt();
		scanner.nextLine();
		
		//진입차수 저장할 배열
		int [] indegree = new int[range+1];
		//간선 정보를 저장할 배열
		int [] links = new int[range+1];

		
		//간선 정보 저장
		for(int i=0; i<cases; i++) {
			int before =scanner.nextInt();
			int after =scanner.nextInt();
			scanner.nextLine();
			indegree[after]++;
			
			links[before]=after;
		}
		
		
		//초기 진입차수 0인거 que에 삽입
		Queue<Integer> search = new LinkedList<>();
		
		for(int j=1; j<range+1; j++) {
			if(indegree[j]==0 ) {	
				search.offer(j);
				System.out.print(j+" ");
			}
		}
		int p;
		while(!search.isEmpty()) {
			p=search.poll();
			
			for(int j=1; j<range+1; j++) {
				if(links[p]==j) {
					indegree[j]--;
					if(indegree[j]==0) {
						search.offer(j);
						System.out.print(j+" ");
					}
				}
				
			}
			
		}
		
	
	}

}