package trees;

class Dnode {
	int data;
	Dnode left, right;

	public Dnode(int val) {
		data = val;
		left = right = null;
	}
}

public class DistanceNode {
	Dnode root;

	void printDistance(Dnode node, int key) {
		if (node == null)
			return;
		if (key == 0) {
			System.out.println(node.data);
			return;
		} else {
			printDistance(node.left, key - 1);
			printDistance(node.right, key - 1);

		}

	}

	public static void main(String[] args) {
		DistanceNode dn = new DistanceNode();
		dn.root = new Dnode(1);
		dn.root.left = new Dnode(2);
		dn.root.right = new Dnode(3);
		dn.root.left.left = new Dnode(4);
		dn.root.left.right = new Dnode(5);
		dn.printDistance(dn.root, 2);

	}

}
