package binarytreeproblems;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode9
{
	int data;
	TreeNode9 left, right;
	public TreeNode9(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class LevelOrderTraversalOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode9 root = printNode();
		levelorder(root);

	}

	public static TreeNode9 printNode()
	{
		TreeNode9 root = new TreeNode9(5);
		root.left  = new TreeNode9(3);
		root.left.left  = new TreeNode9(2);
		root.left.right  = new TreeNode9(4);
		root.right  = new TreeNode9(8);
		root.right.left  = new TreeNode9(7);
		root.right.right  = new TreeNode9(9);
		return root;
	}
	
	
	public static void levelorder(TreeNode9 root)
	{
		if(root == null) return;
		Queue<TreeNode9> q = new LinkedList<TreeNode9>();
		q.add(root);
		while(! q.isEmpty())
		{
			root = q.poll();
			System.out.println(root.data);
			if(root.left != null)
			{
				q.add(root.left);
			}
			if(root.right != null)
			{
				q.add(root.right);
			}			
		}
	}
}

