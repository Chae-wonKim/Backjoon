import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P2252 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int range = scanner.nextInt();
		int cases = scanner.nextInt();
		scanner.nextLine();
		
		//진입차수 저장할 배열
		int [] indegree = new int[range+1];
		//간선 정보를 저장할 배열
		int [][] links = new int[range+1][range+1];
		//출력 list
		List<Integer> print = new ArrayList<>();
		
		
		
		for(int i=0; i<cases; i++) {
			int before =scanner.nextInt();
			int after =scanner.nextInt();
			scanner.nextLine();
			indegree[after]++;
			
			links[before][after] = 1;
			links[after][before] = 1;
		}
		
		Queue<Integer> search = new LinkedList<>();
		int p;
		while(print.size()<range) {
			for(int j=1; j<range+1; j++) {
				if(indegree[j]==0 && !print.contains(j)) {
					search.offer(j);
					print.add(j);
				}
				
			}
			
			while(!search.isEmpty()) {
				p=search.poll();
				for(int j=1; j<range+1; j++) {
					if(links[p][j]==1) {
						indegree[j]--;
					}
				}
			}
				
		}
		
		for(int k=0; k<print.size() ; k++) {
			if(k==print.size()-1) {
				System.out.println(print.get(k));
			} else {
				System.out.print(print.get(k)+" ");	
			}
			
		}

	}

}