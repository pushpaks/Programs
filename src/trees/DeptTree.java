package trees;

import java.util.LinkedList;
import java.util.Queue;

class MaxNode {
	int data;
	MaxNode left, right;

	public MaxNode(int value) {

		data = value;
		left = right = null;
	}
}

public class DeptTree {
	MaxNode root;

	int maxDept(MaxNode node) {

		if (node == null) {
			return 0;
		}

		else {
			int lstree = maxDept(node.left);
			int rstree = maxDept(node.right);
			if (lstree > rstree)
				return lstree + 1;
			else
				return lstree + 1;
		}
	}

		public int findLevelwithMaxSum(MaxNode root) {
			int maxSum = 0, currentSum = 0;
			if (root == null)
				return 0;
			// Initialization
			Queue<MaxNode> q = new LinkedList<MaxNode>();
			q.offer(root);
			q.offer(null);
			while (!q.isEmpty()) {
				MaxNode tmp = q.poll();
				
				if (tmp != null) {
					currentSum+=tmp.data;
					System.out.println(currentSum);
					if (tmp.left != null)
						q.offer(tmp.left);
					if (tmp.right != null)
						q.offer(tmp.right);
				} else {
					if (currentSum > maxSum){
						maxSum =  currentSum;
						System.out.println(maxSum);
					}
					currentSum = 0;
					// completion of a level;
					if (!q.isEmpty())
						q.offer(null);
				}
			}
			return maxSum;
		}

	public static void main(String[] args) {
		DeptTree dt = new DeptTree();
		dt.root = new MaxNode(15);
		dt.root.left = new MaxNode(2);
		dt.root.right = new MaxNode(3);
		dt.root.left.left = new MaxNode(1);
		dt.root.left.right = new MaxNode(1);
		System.out.println("Height or Dept of a Tree is ==> " + dt.maxDept(dt.root));
		System.out.println("Sum or Dept of a Tree is ==> " + dt.findLevelwithMaxSum(dt.root));
	}
}