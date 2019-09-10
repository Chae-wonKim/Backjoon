import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P1260 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		//노드의 개수
		int n = Integer.parseInt(str.split(" ")[0]);
		//간선의 개수
		int m = Integer.parseInt(str.split(" ")[1]);
		//탐색 시작할 정점의 번호
		int v = Integer.parseInt(str.split(" ")[2]);
		//방문 여부를 나타내는 배열
		boolean [] isVisited = new boolean[n+1];
		//간선정보를 나타내는 배열
		int [][] linked = new int[n+1][n+1];
		
		//출력할 배열 받기
		List<Integer> printDfs = new ArrayList<>();
		printDfs.add(v);
		List<Integer> printBfs = new ArrayList<>();
		printBfs.add(v);
		
		
		//간선 정보 받기
		for(int i=1; i<m+1; i++) {
			String s=scanner.nextLine();
			int firstNode = Integer.parseInt(s.split(" ")[0]);
			int secondNode = Integer.parseInt(s.split(" ")[1]);
			linked[firstNode][secondNode]=1;
			linked[secondNode][firstNode]=1;
			
		}
				
		//DFS
		Stack<Integer> stack = new Stack<>();
		stack.push(v);
		
		int p; //현재 탐색중인 정점
		boolean flag;
		
		isVisited[v]=true;

		while(!stack.isEmpty()) {
			p=stack.peek();
			flag=false;
			
			
			for(int i=1; i<n+1; i++) {
				if(linked[p][i]==1 && !isVisited[i]) {
					stack.push(i);
					isVisited[i]= true;
					//출력 -- 그 다음으로 들어오는 노드
					printDfs.add(i);
					flag=true;
					break;
				}
			}
			
			//flag가 false라면 위의 조건문에서 해당하는게 하나도 없었다는 뜻이다.
			//위의 조건문에 해당안될 경우( 즉, 더이상 방문할 것이 없는 경우) 스택에서 뺀다.
			if(!flag) {
				stack.pop();
			}
			
		}
		
		//출력
		for(int k=0; k<printDfs.size(); k++) {
			if(k==printDfs.size()-1) {
				System.out.println(printDfs.get(k));	
			} else {
				System.out.print(printDfs.get(k)+" ");
			}
			
		}
		
		//방문 노드 초기화
		isVisited = new boolean[n+1];
		
		//bfs
		Queue<Integer> que = new LinkedList<>();
		que.offer(v);
		isVisited[v]= true;
				
		while(!que.isEmpty()) {
			p=que.poll();
			
			
			for(int i=1; i<n+1; i++) {
				if(linked[p][i]==1 && !isVisited[i]) {
					que.offer(i);
					isVisited[i]=true;
					printBfs.add(i);
				}
			}
		}
		
		//출력
		for (int k = 0; k < printBfs.size(); k++) {
			if (k == printBfs.size() - 1) {
				System.out.println(printBfs.get(k));
			} else {
				System.out.print(printBfs.get(k) + " ");
			}

		}
		

	}


}
