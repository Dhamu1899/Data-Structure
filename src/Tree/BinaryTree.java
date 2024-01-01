package Tree;

class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}
public class BinaryTree{
	Node root;
	BinaryTree(){
		root=null;
	}
	void inorder(Node node) {
		if (node==null)
			return;
		//Traverse left
		inorder(node.left);
		//Traverse root
		System.out.print(node.item +"->");
		//Traverse right
		inorder(node.right);
		
	}
	void preorder(Node node) {
		if (node==null)
			return;
		//Traverse root
		System.out.print(node.item +"->");
		//Traverse left
		preorder(node.left);
		//Traverse right
		preorder(node.right);
		
	}
	void postorder(Node node) {
		if (node==null)
			return;
		
		//Traverse left
		preorder(node.left);
		//Traverse right
		preorder(node.right);
		//Traverse root
		System.out.print(node.item +"->");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(12);
tree.root.right=new Node(9);
tree.root.left.left=new Node(5);
tree.root.left.right=new Node(6);
System.out.println("inorder traversal");
tree.inorder(tree.root);
System.out.println("\npreorder traversal");
tree.preorder(tree.root);
System.out.println("\npostorder traversal");
tree.postorder(tree.root);
	}

}
