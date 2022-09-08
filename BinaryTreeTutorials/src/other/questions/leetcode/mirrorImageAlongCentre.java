package other.questions.leetcode;

import node.definition.TreeNode;

public class mirrorImageAlongCentre {
	public static boolean isMirrorImage(TreeNode root){
		if(root==null) {
			return true;
		}
		return mirrorImageChecker(root.left,root.right);
	}
	private static boolean mirrorImageChecker(TreeNode left, TreeNode right) {
		if(left==null && right==null) {
			return true;
		}
		if((left==null && right!=null)||(left!=null && right==null)){
			return false;
		}
		if(left.val!=right.val) {
			return false;
		}
		return mirrorImageChecker(left.left, right.right) && mirrorImageChecker(left.right, right.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
