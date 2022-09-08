package traversal.order;

import java.util.ArrayList;
import java.util.List;

import node.definition.TreeNode;

public class PreOrder {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> op = new ArrayList<>();
		preorder(root, op);
		return op;
	}

	private void preorder(TreeNode root, List<Integer> op) {
		if (root == null) {
			return;
		}
		// Go for Value
		System.out.println(root.val);
		op.add(root.val);
		// Go left
		preorder(root.left, op);
		// Go Right
		preorder(root.right, op);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
				new TreeNode(5, null, null));
		PreOrder io = new PreOrder();
		io.preorderTraversal(root);
	}

}
