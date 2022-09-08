package traversal.order;

import java.util.ArrayList;
import java.util.List;

import node.definition.TreeNode;

public class InOrder {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> op = new ArrayList<>();
		inorder(root,op);
		return op;
	}

	private void inorder(TreeNode root, List<Integer> op) {
		if(root==null) {
			return;
		}
		//Go left
		inorder(root.left,op);
		//Go for Value
		op.add(root.val);
		//Go Right
		inorder(root.right,op);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1,new TreeNode(2,null,new TreeNode(4,null,null)),new TreeNode(5,null,null));
		InOrder io = new InOrder();
		io.inorderTraversal(root);
	}

}
