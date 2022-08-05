import java.util.Stack;

public class Queue_Stacks {
	static class QueueSS{
		static Stack<Integer> s1 = new Stack();
		static Stack<Integer> s2 = new Stack();
		public static boolean isEmpty() {
			if(s1.isEmpty()) {
				return true;
			}
			return false;
		}
		public static void add(int data) {
			if(isEmpty()) {
				s1.add(data);
				
			}
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			s1.add(data);
			while(!s2.isEmpty()) {
				s1.add(s2.pop());
			}
			
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return s1.peek();
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = s1.peek();
			s1.pop();
			return result;
		}
		
	}

	public static void main(String[] args) {
		QueueSS queue = new QueueSS();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		while(!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.remove();
		}

	}

}
