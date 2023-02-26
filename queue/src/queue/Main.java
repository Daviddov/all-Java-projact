package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//reverse queue
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
System.out.println(queue);
Stack<Integer> s = new Stack<>();
while(!queue.isEmpty()) {
s.add(queue.remove());
	}
while(!s.isEmpty()) {
	queue.add(s.pop());
}
System.out.println(queue);
	}
}
