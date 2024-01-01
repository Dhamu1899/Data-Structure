package DSA;
import DSA.Add_Between.Node;


@SuppressWarnings("unused")
public class Add_Between {
	  class Node{
		  int data;
		  Node next;
		  public Node(int data) {
			  this.data = data;
			  this.next = null;
		  }
	  }
	  public Node head = null;
	  public Node tail = null;
	  void addNode(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode;
		  }
	  
		  else {
			  tail.next = newNode;  // connecting to the newNode
			  tail = newNode;       // moving the tail
		  }
	  }
	  void addBetween(int pos,int data) {
		  Node newNode = new Node(data);
		  Node current=head;
		  if(head == null) {
			  head= newNode;
			  tail = newNode; 
	  }
		  else {
			  while(current.data!=pos) {
				  current=current.next;
			  }
			  newNode.next = head;  // connecting to the newNode
			  head = newNode;       // moving the tail
		  }
	  }
	  void addlast(int data) {
		  Node newNode = new Node(data);
		  Node current = head;	  
	    if(head==null) {
	    	head = newNode;
	    	tail = newNode;
	    }
	    else {/*
	    while(current.next!=null){
	    current = current.next;
	  }
	  current.next = newNode;
	  */
	    	tail.next= newNode;
	    	tail = newNode;
	    }
	  }
	 // void addBetween(int pos,int )
		  
	  public void display() {
		  Node current = head;
		  if(head == null){
			  System.out.println("Linked list is empty");		  
		  }
		  else {
			  System.out.println("Singly linked list elements are: ");
			  while(current!=null) {
				  System.out.print(current.data+" ");
				  current = current.next;
			  }
		  }
	  }
		public static void main(String[] args) {
			Add_Between sll = new Add_Between();
			sll.addNode(10);
			sll.addNode(5);
			sll.addNode(20);
			sll.addlast(100);
			sll.addlast(200);
			sll.addNode(500);
			sll.display();

		}

	}

