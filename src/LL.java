
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
		System.out.println(list.getSize());
  }
}
