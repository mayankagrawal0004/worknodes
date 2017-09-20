package LinkedList;

public class CircularLinkedList {
	
	public Node first;
	public Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void inserAtBig(int data) {
		Node newnode = new Node(data);
		if(isEmpty()) {
			last = newnode;
		}
		newnode.next = first;
		first = newnode;
	}
	
	public void inserAtLast(int data) {
		Node newnode = new Node(data);
		if(isEmpty()) {
			first = newnode;
			last = newnode;
		}else {
			last.next = newnode;
			last  = newnode;
		}
		
		
		
	}

}
