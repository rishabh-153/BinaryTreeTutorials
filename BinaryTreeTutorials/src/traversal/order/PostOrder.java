package traversal.order;

import java.util.ArrayList;
import java.util.List;

import node.definition.TreeNode;

public class PostOrder {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> op = new ArrayList<>();
		postorder(root, op);
		return op;
	}

	private void postorder(TreeNode root, List<Integer> op) {
		if (root == null) {
			return;
		}

		// Go left
		postorder(root.left, op);
		// Go Right
		postorder(root.right, op);
		// Go for Value
		System.out.println(root.val);
		op.add(root.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
				new TreeNode(5, null, null));
		PostOrder io = new PostOrder();
		io.postorderTraversal(root);
	}
}
