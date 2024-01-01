package Tree;
class Nodee{
	int item;
	Node left,right;
	public Nodee(int key) {
		item = key;
		left = right =null;
	}
}

public class In_Pre_Post_Tree {
	Node root;
	In_Pre_Post_Tree(){
		root = null;
	}
	void inorder(Node node) {
		if(node==null) {
			return;
		}
		//Traverse left
		inorder(node.left);
		//Traverse root
		System.out.print(node.item +"->");
		//Traverse right
		inorder(node.right);
	}

	void preorder(Node node) {//node = root
		if(node == null) {
			return;
		}
		//Treverse root
		System.out.print(node.item + "->");
		//Traverse left
		preorder(node.left);
		//Traverse right
		preorder(node.right);
		
	}
	void postorder(Node node) {//node = root
		if(node == null) {
			return;
		}
		//Traverse left
		postorder(node.left);	
		//Traverse right
		postorder(node.right);
		//Treverse root
		System.out.print(node.item + "->");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		In_Pre_Post_Tree tree = new In_Pre_Post_Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(13);
		tree.root.left.left=new Node(6);
		tree.root.left.right=new Node(10);
		tree.root.right.left=new Node(8);
		tree.root.right.right=new Node(9);
		tree.root.left.left.left=new Node(2);
		tree.root.left.left.right=new Node(3);
		System.out.println("inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);

	}

}	