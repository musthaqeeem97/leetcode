package october;


public class Ex105BinaryTreeFromPreOrderInorder {

	public class TreeNode {
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

	class Solution {
		
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	     return buildTree(preorder, inorder,0,0,inorder.length-1); 
	    }
		private TreeNode buildTree(int[] preorder, int[] inorder,int preIndex ,int inStart, int inEnd) {
			
			if(preIndex>preorder.length||inStart>inEnd) {
				return null;
			}
			TreeNode root = new TreeNode(preorder[preIndex]);
			
			int rootIndexInorder = inStart;
			while(root.val != inorder[rootIndexInorder]) {
				rootIndexInorder++;
			}
			root.left = buildTree(preorder, inorder,preIndex+1,inStart,rootIndexInorder-1);
			root.right = buildTree(preorder, inorder,preIndex+rootIndexInorder-inStart+1,rootIndexInorder+1,inEnd);
				
            return root;		
		}
	    
	    
	}





}
