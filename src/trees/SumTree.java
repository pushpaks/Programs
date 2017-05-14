package trees;

public class SumTree {
	Node root;

	int isLeaf(Node node) {

		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		return 0;

	}

	int isSumTree(Node node) {
		int ls;
		int rs;
		if (node == null || isLeaf(node) == 1)
			return 1;

		if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0) {
			if (node.left == null)
				ls = 0;
			else if (isLeaf(node.left) != 0)
				ls = node.left.value;
			else
				ls = 2 * (node.left.value);

			if (node.right == null)
				rs = 0;
			else if (isLeaf(node.right) != 0)
				rs = node.right.value;
			else
				rs = 2 * (node.right.value);

			if ((node.value == rs + ls))

				return 1;
			else
				return 0;
		}

		return 0;

	}

	public static void main(String[] args) {

		SumTree st = new SumTree();
		st.root = new Node(26);
		st.root.left = new Node(10);
		st.root.right = new Node(3);
		st.root.left.left = new Node(4);
		st.root.left.right = new Node(6);
		st.root.right.right = new Node(3);

		if (st.isSumTree(st.root) != 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
