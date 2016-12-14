

import java.util.Stack;
import java.util.Iterator;

public class IteratorDemo{

	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.value = val;
			this.left = null;
			this.right = null;

		}

	}



	private static class IteratorPreOrderStack implements Iterator<TreeNode> {

		private TreeNode current;

		private Stack<TreeNode> stack = new Stack<TreeNode>();

		// constructor
		public IteratorPreOrderStack(TreeNode root) {

			this.current = root;

		}

		public TreeNode next() {

			if (current == null)
				return null;

			TreeNode temp = current;

			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
			if (!stack.isEmpty())
				current = stack.pop();
			else
				current = null;

			return temp;
		}
		public boolean hasNext() {
			return (!stack.isEmpty() || current != null);
		}
		public void remove() {
		}

	}

	public static void main(String[] args) {

		TreeNode t1 = new TreeNode(20);
		TreeNode t2 = new TreeNode(10);
		TreeNode t3 = new TreeNode(27);
		TreeNode t4 = new TreeNode(25);
		TreeNode t5 = new TreeNode(35);
		TreeNode t6 = new TreeNode(15);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t4.left = t5;
		t3.left = t6;

		IteratorPreOrderStack itr2 = new IteratorPreOrderStack(t1);
		while (itr2.hasNext())
			System.out.print(itr2.next().value + " ");

	}

}
