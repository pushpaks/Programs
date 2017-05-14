package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int value;
	Node1 left;
	Node1 right;

	public Node1(int data) {
		value = data;
		left = right = null;
	}
}

public class LevelOrdering {

	Node1 root;

	void printLevelOrdering() {

		Queue<Node1> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node1 tempNode = queue.poll();
			System.out.print(tempNode.value);
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}

	}

	public static void main(String[] args) {
		LevelOrdering level = new LevelOrdering();
		level.root = new Node1(1);
		level.root.left = new Node1(2);
		level.root.right = new Node1(3);
		level.root.left.left = new Node1(4);
		level.root.left.right = new Node1(5);
		level.root.right.left = new Node1(6);
		level.root.right.right = new Node1(7);
		level.printLevelOrdering();
	}

}
