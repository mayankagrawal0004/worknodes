package LinkedList;

/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


 
/*You are required to complete below method*/
public class link
{
	public static void main(String[] args){
        System.out.println("Nothing is more important");
        link linked = new link();
        linked.head = new Node(5);
        linked.head.next = new Node(6);
        
        linked.head.next.next = new Node(4);
        
        linked.head.next.next.next = new Node(9);
    
   Node temp =  linked.deleteNode(linked.head,4);
        while(linked.head != null){
    	    System.out.println(linked.head.data);
    	    linked.head =linked.head.next;    
        }
    }
	
    Node head;
    Node deleteNode(Node head, int x)
    {
	// your code here
    Node prev = null;
	while(head != null)
	{
	    System.out.println(head.data);
	if(head.data == x) {
		prev.next = head.next;
		head = prev.next;
		
	}else {
	   prev = head;
	    head = head.next;}
	}
	//System.out.println(head.data);
	return head;
    }
     
}
