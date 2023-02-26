package queue;

import java.util.Arrays;

public class MyQueue {
	private int[] queue;
	private int front = 0, last = 0, count = 0;

	public MyQueue(int num) {
		queue = new int[num];
	}

	public boolean isEmpty() {
		if (front == last)
			return true;
		return false;
	}

	public boolean isFull() {
		if (last == queue.length - 1)
			return true;
		return false;
	}

	public int peek() {
		return queue[front];
	}

	public int remove() {
		int item = queue[front];
			front =(front+1)%queue.length;	
			return item;
	}

	public void add(int num) {
		if (count == queue.length - 1) {
			throw new IllegalStateException();
		}
		queue[last] = num;
		last = (last+1)% queue.length;
		count++;
	}
	public String toString() {
		return Arrays.toString(queue);
	}
	
}
