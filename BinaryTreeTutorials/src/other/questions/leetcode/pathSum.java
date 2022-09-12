package other.questions.leetcode;

import node.definition.TreeNode;

public class pathSum {
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if(root==null) {
			return false;
		}
		if(root.left ==null && root.right==null) {
			return root.val==targetSum;
		}
		targetSum-=root.val;
		return(hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum));
	}

	public static void main(String[] args) {
		TreeNode val10=new TreeNode(10, null, null);
		TreeNode val9=new TreeNode(9, null, val10);
		TreeNode val8=new TreeNode(8, null, null);
		TreeNode val7=new TreeNode(7, null, null);
		TreeNode val6=new TreeNode(6, val8, val9);
		TreeNode val5=new TreeNode(5, null, null);
		TreeNode val4=new TreeNode(4, val7, null);
		TreeNode val3=new TreeNode(3, val5, val6);
		TreeNode val2=new TreeNode(2, val4, null);
		TreeNode root=new TreeNode(1, val2, val3);
		System.out.println(hasPathSum(root,9));
		/*                       --------------1---------------
		 *             ----------2                   ----------3-------------
		 *    ---------4                             5          -------------6--------
		 *    7                                                 8                     9------------
		 *                                                                                        10
		  
		 */
	}

}
