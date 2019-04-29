package binarytreeproblems;
import java.util.Random;

/* Depth first binary tree traversal
 * Total time for preorder/inorder/postorder = O(n) bcoz we visit all the nodes
 * size of the stack in the worst case will be the height of the binary tree*/

class TreeNode
{
	int data;
	TreeNode left, right;
	public TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class BinaryTreeConstructAndTraversal {
	
	public static void main(String[] args)
	{
		TreeNode root = printNode();
		System.out.println("*******************");
		System.out.println("Inorder");
		System.out.println("*******************");
		inorder(root);
		System.out.println("*******************");
		System.out.println("Preorder");
		System.out.println("*******************");
		preorder(root);
		System.out.println("*******************");
		System.out.println("Postorder");
		System.out.println("*******************");
		postorder(root);
	}
	
	public static TreeNode printNode()
	{
//		TreeNode root = new TreeNode(5);
//		root.left = new TreeNode(3);
//		root.right = new TreeNode(8);
//		root.left.left = new TreeNode(2);
//		root.left.right = new TreeNode(4);
//		root.right.left = new TreeNode(7);
//		root.right.right = new TreeNode(9);
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(15);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(6);
		root.left.left.left = new TreeNode(5);
		root.right.right = new TreeNode(2);
		root.right.right.left = new TreeNode(9);
		root.right.right.right = new TreeNode(8);
		return root;
	}
	
	
	public static void inorder(TreeNode root)
	{
		if(root !=null)
		{
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
	
	public static void preorder(TreeNode root)
	{
		if(root !=null)
		{
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		}
	}
	
	
	public static void postorder(TreeNode root)
	{
		if(root !=null)
		{
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
		}
	}


}


