import java.util.ArrayList;
public class implimentationStack {
	
		static class Node{
				int data;
				Node next;
				public   Node(int data){
					this.data = data;
					next = null;
				}
		}
		static class StackLL{		
		public static Node head;
		public static boolean isEmpty() {
			if(head == null)return true;
			return false;
			
		}
		public  static void push(int data) {
			
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
			}
			newNode.next = head;
			head = newNode;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		public static int peek() {
			if(isEmpty())return -1;
			return head.data;
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StackLL s = new StackLL();
     s.push(0);
     s.push(2);
     System.out.println(s.peek());
     s.push(4);
     System.out.println(s.pop());
	}

}


 
	 

  

 
	
		