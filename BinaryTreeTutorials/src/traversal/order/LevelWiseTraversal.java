package traversal.order;

import java.util.ArrayList;
import java.util.List;

import node.definition.TreeNode;

public class LevelWiseTraversal {
	public static List<Integer> levelWiseTraversal(TreeNode root) {
		//A structure to hold output.
		List<Integer> op = new ArrayList<>();
		//A structure to hold all the nodes at a particular level.
		List<TreeNode> levelNodeList = new ArrayList<>();
		//As root is the only node at its level, adding it to the node list.
		levelNodeList.add(root);
		//recursive method call which starts the traversal.
		levelTraversal(levelNodeList, op);
		return op;
	}

	private static void levelTraversal(List<TreeNode> levelNodeList, List<Integer> op) {
		//exit condition for the recursive call.
		if (levelNodeList.isEmpty()) {
			return;
		}
		//list to hold all children of a particular level
		List<TreeNode> tempList = new ArrayList<>();
		for (TreeNode tn : levelNodeList) {
			// If the node has left value as not null, add it to the children list
			if(tn.left!=null) {
				tempList.add(tn.left);
			}
			// If the node has right value as not null, add it to the children list
			if(tn.right!=null) {
				tempList.add(tn.right);
			}
			// Add value to the return list.
			System.out.println(tn.val);
			op.add(tn.val);
		}
		//update the level node list with the new child node list
		levelNodeList.clear();
		levelNodeList.addAll(tempList);
		//call the recursive traversal method with the new set of values.
		levelTraversal(levelNodeList, op);
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
		levelWiseTraversal(root);
		/*                       --------------1---------------
		 *             ----------2                   ----------3-------------
		 *    ---------4                             5          -------------6--------
		 *    7                                                 8                     9------------
		 *                                                                                        10
		  
		 */
	}

}
