package Linked_List;

public class Doubly_Linked_List {
	class Node{
		//stores data
		public int data;
		//poiter to the next node
		public Node next;
		//pointer to the previous node
		public Node prev;
		public Node (int data) {
			this.data=data;
		}
	}
	//to represent head of doubly linkd list
	Node head=null;
	//to represent tail of doubly linkd list
	Node tail=null;
	public void addNodeFront(int val) {
		Node temp=new Node(val);
		if(head!=null)
	{
			head.prev=temp;
			temp.next=head;
	}
		head=temp;
		if(tail==null)
			tail=temp;
	}
	public void addNodeBack(int val) {
		Node temp=new Node(val);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
	}
		tail=temp;
		if(head==null)
		{
			head=temp;
	}
	//System.out.println("New node added to the end:"+val);
	}
	public void removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev=null;
	System.out.println("Deleted:"+temp.data);
	//return temp.data;
	}
	public void removeNodeBack() {
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
	System.out.println("Deleted:"+temp.data);
	//return temp.data;
	}

	public void iterateForward() {
		Node temp=head;
		while (temp!=null){	
			System.out.println(temp.data);
			temp=temp.next;
			}
	}
	public void iterateBackward() {
		Node temp=head;
		while (temp!=null){	
			System.out.println(temp.data);
			temp=temp.next;
			}
	}
	public static void main(String[] args) {
		Doubly_Linked_List dll=new Doubly_Linked_List();
		dll.addNodeFront(2);
		dll.addNodeFront(100);
		dll.addNodeBack(1200);
		dll.addNodeBack(2000);
		dll.addNodeBack(500);
		System.out.println("Doubly linked list before remove:");
		dll.iterateForward();
		dll.removeNodeFront();
		System.out.println("Doubly linked list remove front:");
		dll.iterateForward();
		dll.removeNodeBack();
		System.out.println("Doubly linked list after remove:");
		dll.iterateForward();
		System.out.println("Iterate Backward:");
		dll.iterateBackward();
		}

	}