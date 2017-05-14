package trees;

class Node {
	int value;
	Node left, right;

	Node(int data) {
		value = data;
		left = null;
		right = null;
	}
}

public class TreeTraversal {
	Node root = null;

	public TreeTraversal(int data) {

		root = new Node(data);

	}

	public TreeTraversal() {
		root = null;
	}

	private void inOrder(Node root) {

		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.value);
		inOrder(root.right);
	}

	private void preOrder(Node root) {

		if (root == null)
			return;
		System.out.print(root.value);
		preOrder(root.left);
		preOrder(root.right);
	}

	private void postOrder(Node root) {

		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value);
	}

	public void postOrder() {
		postOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void preOrder() {
		preOrder(root);
	}

	public static void main(String[] args) {

		TreeTraversal bt = new TreeTraversal();
		bt.root = new Node(4);
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.left = new Node(2);
		bt.root.left.right = new Node(1);
		bt.root.right.left = new Node(7);
		bt.root.right.right = new Node(8);
		bt.preOrder();
		bt.inOrder();
		bt.postOrder();
	}
}
