import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class P10828 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < testCase; i++) {
			String command = scanner.nextLine();
			if (command.indexOf("push") >= 0) {
				int num=Integer.parseInt(command.split(" ")[1]);
				stack.push(num);
			} else {
				switch (command) {
				case "top":
					if (stack.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(stack.peek());
					}
					break;

				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "pop":
					if (stack.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(stack.pop());
					}
					break;

				}

			}

		}

	}

}
