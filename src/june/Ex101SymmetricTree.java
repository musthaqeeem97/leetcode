package june;


import june.Ex236LowestCommonAncestorofaBinaryTree.TreeNode;

public class Ex101SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
        
		if (root == null) {
			return true;
		}
		
	    return mirror(root.left,root.right);
	   
    }

	private boolean mirror(TreeNode node1, TreeNode node2) {
		
		if (node1==null&&node2==null) {
		
			return true;
		}
		
		if (node1==null||node2==null||node1.val!=node2.val) {	
			
			return false;
		}
		
		return mirror(node1.left, node2.right)&& mirror(node1.right, node2.left);
	}
 }

