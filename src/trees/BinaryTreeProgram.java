package trees;

class BinaryTreeNode {
	int key;
	BinaryTreeNode left, right;

	public BinaryTreeNode(int data) {
		key = data;
		left = right = null;
	}
}

public class BinaryTreeProgram {
	BinaryTreeNode root;

	BinaryTreeProgram(int data) {
		root = new BinaryTreeNode(data);
	}

	public BinaryTreeProgram() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTreeProgram btp = new BinaryTreeProgram();
		btp.root = new BinaryTreeNode(5);
		btp.root.left = new BinaryTreeNode(4);
		btp.root.right = new BinaryTreeNode(3);
		System.out.println(btp.root.key);
		System.out.println(btp.root.left.key);
		System.out.println(btp.root.right.key);
	}
}
