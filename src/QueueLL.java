
public class QueueLL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class QueueL{
		static Node head;
		static Node tail;
		public static void add(int data) {
			Node newNode = new Node(data);
			if(tail == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
			
		}
		public static int peek() {
			if(head == null) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
		}
		public static int remove() {
			if(head == null) {
				System.out.println("Queue is empty");
				return -1;
			}
			if(head == tail) {
				tail = null;
			}
			int num = head.data;
			head = head.next;
			return num;
		}
	}

	public static void main(String[] args) {
		QueueL queue = new QueueL();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		while(queue.peek() != -1) {
			System.out.println(queue.peek());
			queue.remove();

	}
	}
}
