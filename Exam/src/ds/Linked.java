package LinkedList;

public class Linked {
Node head;

public static void main(String[] args) {
	
	Node hs = new Node(5);
	hs.next = new Node(9);
	hs.next.next = null;
	
	while(hs.next == null ) {
		System.out.println();
	}
Linked list = new Linked();
list.head = new Node(1);
list.head.next = hs;
int i =0;
Node prev = null;
Node temp = list.head;
while(temp != null) 
{
	System.out.println(temp.data);
    
    if(i==2) 
    {
    	System.out.println(i + "pointerloop");
    	Node newnode = new Node(4);
    	newnode.next = prev.next;
    	prev.next = newnode;
    }
    else 
    {
    	prev= temp;
    	temp = temp.next;	
    	System.out.println(i + "pointerelse");
    }
    i++;
    System.out.println(i + "pointer");
    System.out.println(temp.data);
}
}
	
}
