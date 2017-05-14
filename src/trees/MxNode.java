package trees;

import java.util.LinkedList;
import java.util.Queue;

class Manode {

	int data;
	Manode left, right;

	public Manode(int value) {
		data = value;
		left = right = null;
	}

}

public class MxNode {
	Manode root;

	// recursive method
	int maxRec(Manode node) {
		int max = Integer.MIN_VALUE;
		if (node != null) {
			int left = maxRec(node.left);
			int right = maxRec(node.right);
			if (left > right)
				max = left;
			else
				max = right;
		}
		if (node.data > max)
			max = node.data;
		return max;
	}

	int maxIte(Manode node) {
		int max = Integer.MIN_VALUE;
		if (node == null)
			return max;
		Queue<Manode> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			Manode temp = queue.poll();
			if (temp.data > max) {
				max = temp.data;
			}
			if (temp != null) {
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
		}
		return max;
	}

}
