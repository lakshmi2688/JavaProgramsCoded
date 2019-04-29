package binarysearchtreeproblems;


class TreeNode
{
	TreeNode left, right;
	int data;
	public TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class VerifyBinarytreeIsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = printNode();
		isBST(root);
		
		
		
	}
	
	
	public static boolean isBST(TreeNode root)
	{
		
		return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}
	
	
	public static boolean helper(TreeNode root, int min, int max)
	{
		if(root == null) return true;
		if(root.data <= min || root.data > max)
		{
			return false;
		}
		return helper(root.left,min,root.data) && helper(root.right,root.data,max);
	}
	
	
	public static TreeNode printNode()
	{
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		return root;
	}

}
