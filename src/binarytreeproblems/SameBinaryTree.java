package binarytreeproblems;

/* Time complexity - O(n), where n is the size of the binary tree*/

class TreeNode2
{
	
	TreeNode2 left, right;
	int data;
	public TreeNode2(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class SameBinaryTree {
	
	public static void main(String[] args)
	{
		TreeNode2 root1 = printNodeTree1();
		TreeNode2 root2 = printNodeTree2();
		boolean res = sameTree(root1, root2);
		System.out.println(res);
		
	}
	
	

	public static  boolean sameTree(TreeNode2 root1, TreeNode2 root2)
	{
		if(root1 == null && root2 == null)
		{
			return true;
		}
		
		if(root1 == null || root2 == null)
		{
			return false;
		}
		
		
		return  root1.data == root2.data 
				&& sameTree(root1.left, root2.left) 
				&& sameTree(root1.right, root2.right);
	}
	
	public static TreeNode2 printNodeTree1()
	{
		TreeNode2 root = new TreeNode2(5);
		root.left = new TreeNode2 (3);
		root.right = new TreeNode2 (8);
		root.left.left = new TreeNode2 (2);
		root.left.right = new TreeNode2 (4);
		root.right.left = new TreeNode2 (7);
		root.right.right = new TreeNode2 (9);
		return root;
	}
	
	
	public static TreeNode2 printNodeTree2()
	{
		TreeNode2 root = new TreeNode2(5);
		root.left = new TreeNode2 (3);
		root.right = new TreeNode2 (8);
		root.left.left = new TreeNode2 (19);
		root.left.right = new TreeNode2 (4);
		root.right.left = new TreeNode2 (7);
		root.right.right = new TreeNode2 (9);
		return root;
	}
}
