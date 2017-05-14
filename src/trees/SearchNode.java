package trees;

import java.util.LinkedList;
import java.util.Queue;

class SeNode {
	int data;
	SeNode left, right;

	public SeNode(int value) {
		data = value;
		left = right = null;

	}
}

public class SearchNode {
	SeNode root;

	// recursive
	boolean search(SeNode node, int data) {
		if (node == null)
			return false;

		if (node.data == data)
			return true;
		return search(node.left, data) || search(node.right, data);

	}

	// iterative

	boolean searchIte(SeNode node, int data) {

		Queue<SeNode> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			SeNode temp = queue.poll();
			if (temp.data == data)
				return true;
			if (temp != null) {
				if (temp.left != null)
					queue.offer(node.left);
				if (temp.left != null)
					queue.offer(node.right);
			}

		}
		return false;
	}

}
