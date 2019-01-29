package binarytreeproblems;


/* * Time complexity - O(n) bcoz we visit all the nodes
	 * Space complexity(because of recursion stack) - height of binary tree. Worst case O(n)*/


class TreeNode3
{
	TreeNode3 left, right;
	int data;
	public TreeNode3(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class HeightOfBinaryTree {
	
	public static void main(String[] args)
	{
		TreeNode3 root = printNode();
		int height = heightOfBST(root);
		System.out.println(height);
		
	}
	
	
	public static int heightOfBST(TreeNode3 root)
	{
		if(root == null)
		{
			return -1;
		}
		int left = heightOfBST(root.left);
		int right = heightOfBST(root.right);
		return  Math.max(left, right) + 1;
	}
	
	public static TreeNode3 printNode()
	{
		TreeNode3 root = new TreeNode3(5);
		root.left = new TreeNode3 (3);
		root.right = new TreeNode3 (8);
		root.left.left = new TreeNode3 (2);
		root.left.right = new TreeNode3 (4);
		root.right.left = new TreeNode3 (7);
		root.right.right = new TreeNode3 (9);
		return root;
	}

}
