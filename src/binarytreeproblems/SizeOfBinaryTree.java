package binarytreeproblems;


class TreeNode1
{
	TreeNode1 left, right;
	int data;
	public TreeNode1(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class SizeOfBinaryTree {
	
	/**
	 *  Given a root of binary tree, return size of binar tree
	 * 
	 * Solution:
	 * Recursively find size of left side, right side and add one to them and return that to calling function.
	 * 
	 * Time complexity - O(n)
	 * Space complexity(because of recursion stack) - height of binary tree. Worst case O(n)
	 * 
	 * Test cases:
	 * Null tree
	 * 1 node tree
	 * multi node tree
	 */
	
	public static void main(String[] args)
	{
		TreeNode1 root = printNode();
		int size = sizeOfBST(root);
		System.out.println(size);
		
	}
	
	
	public static int sizeOfBST(TreeNode1 root)
	{
		if(root == null)
		{
			return 0;
		}
		int left = sizeOfBST(root.left) ;
		int right = sizeOfBST(root.right);
		return  left + right + 1;
	}
	
	public static TreeNode1 printNode()
	{
		TreeNode1 root = new TreeNode1(5);
		root.left = new TreeNode1 (3);
		root.right = new TreeNode1 (8);
		root.left.left = new TreeNode1 (2);
		root.left.right = new TreeNode1 (4);
		root.right.left = new TreeNode1 (7);
		root.right.right = new TreeNode1 (9);
		return root;
	}
	
	
	

}
