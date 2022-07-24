
 class LL {
	Node head;
	int size=0;
	public class Node {
		String data;
		Node next;
		 Node(String data) {
			 size++;
			this.data=data;
			this.next=next;
		}
	}
public void addFirst(String data) {
	Node newNode= new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
}
public void addLast(String data) {
	Node newNode = new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	Node currentNode=head;
	while(currentNode.next!=null) {
		currentNode = currentNode.next;
	}
	currentNode.next=newNode;
}
public void printList() {
	Node currentNode=head;
	while(currentNode!=null) {
		System.out.print(currentNode.data+" -> ");
		currentNode=currentNode.next;
	}
	System.out.println();
}
public void removeFirst() {
	if(head==null) {
		System.out.println("list is empty, cant remove");
		return;
	}
	head=head.next;
	size--;
}
public void removeLast() {
	if(head==null) {
		System.out.println("list is empty, cant remove");
		return;
	}
	size--;
	if(head.next==null) {
		head=null;
		return;
	}
	Node currentNode=head;
	Node lastNode=head.next;
	while(lastNode.next!=null) {
		currentNode=currentNode.next;
		lastNode=lastNode.next;
	}
	currentNode.next=null;
}
public void addInMiddle(int index, String data) {
	if(index<0 || index >size) {
		System.out.println("Invalid index");
	}
	
	Node newNode = new Node(data);
	if(index==0 || head==null) {
		head=newNode;
	}
	Node currentNode=head;
	for(int i=1; i<size; i++) {
		if(i==index) {
		Node  nextNode= currentNode.next;
		currentNode.next=newNode;
		newNode.next=nextNode;
		break;
		}
		currentNode=currentNode.next;
	}
}
public void reverseList() {
	if(head==null || head.next==null) {
		return;
	}
	Node prevNode = head;
	Node currentNode = head.next;
	
	while(currentNode!=null) {
		Node nextNode = currentNode.next;
		currentNode.next = prevNode;
		prevNode = currentNode;
		currentNode= nextNode;
		
	}
	head.next = null;
	head = prevNode;
}
public Node reverseRecursive(Node head) {
	if(head==null || head.next==null)return head;
	Node newHead = reverseRecursive(head.next);
	head.next.next=head;
	head.next=null;
	return newHead;
}
public int getSize() {
	return size;
}
	public static void main(String[] args) {
		LL list =new LL();
		list.addFirst("hi");
		list.addLast("denis");
		list.addLast("victor");
		list.addFirst("oh");
		list.removeFirst();
		list.removeLast();
		list.printList();
		list.addInMiddle(2,"surname");
		list.printList();
		System.out.println(list.getSize());
		//list.reverseList();
	list.head = list.reverseRecursive(list.head);
		list.printList();
  }
}
