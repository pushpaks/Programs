package trees;

class TreeNode {

	int data;
	TreeNode left, right;

	public TreeNode(int value) {

		data = value;
		left = right = null;
	}

}

public class IdenticalTree {

	TreeNode root1, root2;

	Boolean isIdenticalTree(TreeNode a, TreeNode b) {

		if (a == null && b == null)
			return true;
		if (a != null && b != null)
			return (a.data == b.data) && isIdenticalTree(a.left, b.left) && isIdenticalTree(a.right, b.right);

		return false;

	}

	public static void main(String[] args) {
		IdenticalTree idt = new IdenticalTree();
		idt.root1 = new TreeNode(5);
		idt.root2 = new TreeNode(5);
		idt.root1.left = new TreeNode(10);
		idt.root2.left = new TreeNode(10);
		idt.root1.right = new TreeNode(5);
		idt.root2.right = new TreeNode(15);
		if (idt.isIdenticalTree(idt.root1, idt.root2))
			System.out.println("Identical");
		else
			System.out.println("Not Identical");
	}
}
