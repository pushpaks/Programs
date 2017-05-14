package trees;

class SpiralNode {
	int data;
	SpiralNode left, right;

	public SpiralNode(int value) {
		data = value;
		left = right = null;
	}

}

public class SpiralTraverse {

	SpiralNode root;

	void printspiral(SpiralNode node) {
		int height = getHeight(node);
		int i;
		boolean ltr = false;
		for (i = 1; i <= height; i++) {

			printLevel(node, i, ltr);
			ltr = !ltr;

		}

	}

	void printLevel(SpiralNode node, int level, boolean ltr) {

		if (node == null)
			return;
		if (level == 1)
			System.out.println(node.data);
		if (level > 1) {
			if (ltr != false) {
				printLevel(node.left, level - 1, ltr);
				printLevel(node.right, level - 1, ltr);
			} else {
				printLevel(node.right, level - 1, ltr);
				printLevel(node.left, level - 1, ltr);
			}
		}
	}

	int getHeight(SpiralNode node) {
		if (node == null)
			return 0;

		else {
			int lh = getHeight(node.left);
			int rh = getHeight(node.right);
			if (lh > rh)
				return (lh + 1);
			else
				return (rh + 1);

		}
	}

	public static void main(String[] args) {

		SpiralTraverse st = new SpiralTraverse();
		st.root = new SpiralNode(1);
		st.root.left = new SpiralNode(2);
		st.root.right = new SpiralNode(3);
		st.root.left.left = new SpiralNode(7);
		st.root.left.right = new SpiralNode(6);
		st.root.right.left = new SpiralNode(5);
		st.root.right.right = new SpiralNode(4);
		st.printspiral(st.root);

	}

}
