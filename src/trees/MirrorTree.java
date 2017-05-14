package trees;

class Mnode {
	int data;
	Mnode left, right;

	public Mnode(int value) {
		data = value;
		left = right = null;
	}
}

public class MirrorTree {
	Mnode root;

	void mirror() {
		mirror(root);
	}

	void inOrder() {
		inOrder(root);
	}

	Mnode mirror(Mnode node) {
		if (node == null)
			return node;
		Mnode left = mirror(node.left);
		Mnode right = mirror(node.right);

		node.left = right;
		node.right = left;

		return node;
	}

	void inOrder(Mnode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(" " + node.data + " ");
		inOrder(node.right);

	}

	public static void main(String[] args) {
		MirrorTree mt = new MirrorTree();
		mt.root = new Mnode(1);
		mt.root.left = new Mnode(3);
		mt.root.right = new Mnode(2);
		mt.root.right.left = new Mnode(5);
		mt.root.right.right = new Mnode(4);
		mt.inOrder();
		mt.mirror();
		mt.inOrder();
	}

}
