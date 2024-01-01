package Linked_List;

public class CircularLinkedList {
	//represents the node of list.
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	//Declaring head and tail pointer as null
	public Node head = null;
	public Node tail = null;
	
	//this function will add the new node at the end of the list
	public void add(int data) {
		//create new node
		Node newNode = new Node(data);
		//Checkes if the list is empty
		if(head == null) {
			//if it empty,both head and tail would point to new node.
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			//tail will point to new node.
			tail.next = newNode;
			//new node willl become new tail.
			tail = newNode;
			//Since ,it is circular linked list tail will point to head
			tail.next = head;
		}
	}
	
	//Displays all the nodes in the list
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List ids empty");
			return;
		}else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				//Prints each node by increamenting pointer
				System.out.println(" "+ current.data);
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl = new CircularLinkedList();
		//Adds data to the list
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		//display all the nodes present in the list
		cl.display();
		

	}

}