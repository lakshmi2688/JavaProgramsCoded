package binarysearchtreeproblems;

/*
 * * Time complexity is O(n) for non-balanced BST
 * Time complexity is O(logn) for balanced BST
 * */

class TreeRoot
{
	TreeRoot left, right;
	int data;
	public TreeRoot(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class InsertInBinarySearchTree {
	
	public static void main(String[] args)
	{
		TreeRoot root = printNode();
		int val = 10;
		inorder(insertNode(root,val));
	}
	
	public static TreeRoot printNode()
	{
		TreeRoot root = new TreeRoot(5);
		root.left = new TreeRoot (3);
		root.right = new TreeRoot (8);
		root.left.left = new TreeRoot (2);
		root.left.right = new TreeRoot (4);
		root.right.left = new TreeRoot (7);
		root.right.right = new TreeRoot (9);
		return root;
	}

	public static TreeRoot insertNode(TreeRoot root, int val)
	{
		TreeRoot node = new TreeRoot(val);
		
		if(root == null)
		{
			return node;
		}
		
		TreeRoot parent = null, current = root;
		
		/*At the end of this while loop, current will become null, and parent will be the node 
		 * whose left or right will have the new node to be inserted*/
		while(current != null)
		{
			parent = current;
			if(current.data <= val)
			{
				current = current.right;
			}
			else
			{
				current = current.left;
			}			
		}
		
		/*Here we check whether new node will be inserted to the right or left of the parent*/
		if(parent.data <= val)
		{
			parent.right = node;
		}
		else
		{
			parent.left = node;
		}
		
		return root;
	}
	
	
	public static void inorder(TreeRoot root)
	{
		if(root !=null)
		{
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
}
