package june;

public class Ex98ValidateBinarySearchTree {

	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode() {}
		 TreeNode(int val) { this.val = val; }
		 TreeNode(int val, TreeNode left, TreeNode right) {
			 this.val = val;
			 this.left = left;
			 this.right = right;
		 }
	 }
	 public boolean isValidBST(TreeNode root) {
		    long min = Long.MIN_VALUE;
		    long max = Long.MAX_VALUE;
	        return isValidBST(root,min,max);
	    }
	 private boolean isValidBST(TreeNode root, long min, long max) {
		
		if (root == null) {
			return true;
		}
		if (root.val<=min||root.val>=max) {
			return false;
		}
		boolean left = isValidBST(root.left,min,root.val);
		if (left) {
		    return isValidBST(root.right,root.val,max);
		}
		return false;
	}
}
