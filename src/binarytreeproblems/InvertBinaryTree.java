package binarytreeproblems;

class TreeNode10
{
	int data;
	TreeNode10 left, right;
	public TreeNode10(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class InvertBinaryTree {
	
	public static void main(String[] args)
	{
		TreeNode10 root = printNode();
		System.out.println("Before inversion");
		inorder(root);
		System.out.println("After inversion");
		inorder(invertTree(root));
	}
	
	public static TreeNode10 printNode()
	{		
		TreeNode10 root = new TreeNode10(10);
		root.left = new TreeNode10(15);
		root.right = new TreeNode10(30);
		root.left.left = new TreeNode10(3);
		root.left.right = new TreeNode10(6);
		root.left.left.left = new TreeNode10(5);
		root.right.right = new TreeNode10(2);
		root.right.right.left = new TreeNode10(9);
		root.right.right.right = new TreeNode10(8);
		return root;
	}
	
	public static void inorder(TreeNode10 root)
	{
		if(root !=null)
		{
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
	
	
	public static TreeNode10 invertTree(TreeNode10 root)
	{
		if(root == null) return root;
		TreeNode10 left = invertTree(root.left);
		TreeNode10 right = invertTree(root.right);
		root.right = left;
		root.left = right;		
		return root;
		
	}

}
