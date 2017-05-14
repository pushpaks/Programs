package trees;

class SumNode {
	int data;
	SumNode left, right;

	public SumNode(int val) {
		data = val;
		left = right = null;
	}

}

public class SumPath {
	SumNode root;

	boolean hasSumPath(SumNode node, int sum) {
		boolean sumValue = false;
		if (node == null)
			return (sum == 0);
		else {
			int subsum = sum - node.data;
			if (subsum == 0 && node.left == null && node.right == null)
				return true;
			if (node.left != null)
				sumValue = sumValue || hasSumPath(node.left, subsum);
			if (node.right != null)
				sumValue = sumValue || hasSumPath(node.right, subsum);
			return sumValue;
		}

	}

	public static void main(String[] args) {
		int sum = 21;

		SumPath tree = new SumPath();
		tree.root = new SumNode(10);
		tree.root.left = new SumNode(8);
		tree.root.right = new SumNode(2);
		tree.root.left.left = new SumNode(3);
		tree.root.left.right = new SumNode(5);
		tree.root.right.left = new SumNode(2);
		if (tree.hasSumPath(tree.root, sum)) {
			System.out.println("Has path");
		} else {
			System.out.println("Has no  path");
		}
	}

}
