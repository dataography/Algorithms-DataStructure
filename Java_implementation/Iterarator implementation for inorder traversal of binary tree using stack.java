

import java.util.Stack;
import java.util.Iterator;

public class IteratorDemo {

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

	private static class IteratorInOrderStack implements Iterator<TreeNode> {
		
		private TreeNode current;
		private Stack<TreeNode> stack = new Stack<TreeNode>();

		
		public IteratorInOrderStack(TreeNode root) {
			this.current = root;
		}

		// successor node
		public TreeNode next() {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			TreeNode ret = stack.pop();
			current = ret.right;
			return ret;
		}

		public boolean hasNext() {
			return current != null || !stack.isEmpty();
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
		
		IteratorInOrderStack itr1 = new IteratorInOrderStack(t1);
		itr1.next();
		itr1.remove();
		while (itr1.hasNext())
			System.out.print(itr1.next().value + " ");


	}

}
