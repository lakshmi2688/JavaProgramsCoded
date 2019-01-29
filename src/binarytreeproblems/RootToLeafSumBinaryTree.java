package binarytreeproblems;

import java.util.LinkedList;

class TreeNode4
{
	int data;
	TreeNode4 left, right;
	public TreeNode4(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class RootToLeafSumBinaryTree {
	
	public static void main(String[] args)
	{
		TreeNode4 root = printNode();
		LinkedList<Integer> result = new LinkedList<Integer>();
		int sum = 22;
		boolean flag = rootToLeafSum(root,sum, result);
		System.out.println("sum found : " + flag);
		if(flag)
		{
			for(int item: result)
			{
				
				System.out.println("path is : " + item);
			}
		}
	}
	
	public static boolean rootToLeafSum(TreeNode4 root, int sum, LinkedList<Integer> result)
	{
		if(root == null)
		{
			return false;
		}
		
		if(root.left == null && root.right == null) // checking to see if leaf node
		{
			if(root.data == sum)
			{
				result.add(root.data);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		if(rootToLeafSum(root.left, sum - root.data, result))
		{
			result.add(root.data);
			return true;
		}
		
		
		if(rootToLeafSum(root.right, sum - root.data, result))
		{
			result.add(root.data);
			return true;
		}
		return false;
	}
	
	public static TreeNode4 printNode()
	{
		TreeNode4 root = new TreeNode4(5);
		root.left  = new TreeNode4(3);
		root.left.left  = new TreeNode4(2);
		root.left.right  = new TreeNode4(4);
		root.right  = new TreeNode4(8);
		root.right.left  = new TreeNode4(7);
		root.right.right  = new TreeNode4(9);
		return root;
	}
	

}



