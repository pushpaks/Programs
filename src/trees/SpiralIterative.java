package trees;

import java.util.Stack;

class Snode {

	int data;
	Snode left, right;

	public Snode(int val) {
		data = val;
		left = right = null;
	}

}

public class SpiralIterative {

	Snode root;

	void printNode(Snode node) {

		if (node == null)
			return;
		Stack<Snode> s1 = new Stack<>();
		Stack<Snode> s2 = new Stack<>();
		s1.push(node);
		while (!s1.empty() || !s2.empty()) {
			while (!s1.isEmpty()) {
				Snode temp = s1.peek();
				s1.pop();
				System.out.println(temp.data);
				if (temp.left != null)
					s2.push(temp.right);
				if (temp.right != null)
					s2.push(temp.left);
			}
			while (!s2.isEmpty()) {
				Snode temp = s2.peek();
				s2.pop();
				System.out.println(temp.data);
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}
		}
	}

	public static void main(String[] args) {

		SpiralIterative si = new SpiralIterative();
		si.root = new Snode(1);
		si.root.left = new Snode(2);
		si.root.right = new Snode(3);
		si.root.left.left = new Snode(7);
		si.root.left.right = new Snode(6);
		si.root.right.left = new Snode(5);
		si.root.right.right = new Snode(4);
		si.printNode(si.root);

	}
}
