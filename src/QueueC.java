
public class QueueC {
	static int size;
	static int arr[];
	static int front = -1;
	static int rear = -1;
	QueueC(int n){
		arr = new int [n];
		this.size = n;
	}
	public static boolean isEmpty() {
		return rear == -1 && front == -1;
	}
	public static boolean isFull() {
		return (rear+1)%size == front;
	}
	public static void add(int data) {
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}
		if(front == -1) {
			front = (front+1)%size;
		}
		rear = (rear+1)%size;
		arr[rear] = data;
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int result = arr[front];
		if(rear == front) {
			rear = front = -1;
			return result;
		}
		
		front = (front+1)%size;
		return result;
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[front];
	}

}
