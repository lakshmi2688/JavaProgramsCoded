package binarytreeproblems;

class TreeNode11
{
	int data;
	TreeNode11 left, right;
	public TreeNode11(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class MergeTwoBinaryTrees {
	
	public static void main(String[] args)
	{
		TreeNode11 roota = printNode();
		TreeNode11 rootb = printNode();
		System.out.println("Before merge");
		inorder(roota);
		inorder(rootb);
		System.out.println("After merge");
		inorder(mergeTrees(roota,rootb));
	}
	
	public static TreeNode11 printNode()
	{		
		TreeNode11 root = new TreeNode11(10);
		root.left = new TreeNode11(15);
		root.right = new TreeNode11(30);
		root.left.left = new TreeNode11(3);
		root.left.right = new TreeNode11(6);
		root.left.left.left = new TreeNode11(5);
		root.right.right = new TreeNode11(2);
		root.right.right.left = new TreeNode11(9);
		root.right.right.right = new TreeNode11(8);
		return root;
	}
	
	
	public static TreeNode11 printNode1()
	{		
		TreeNode11 root = new TreeNode11(5);
		root.left = new TreeNode11(3);
		root.right = new TreeNode11(8);
		root.left.left = new TreeNode11(2);
		root.left.right = new TreeNode11(4);
		root.right.left = new TreeNode11(7);
		root.right.right = new TreeNode11(9);
		return root;
	}
	
	public static void inorder(TreeNode11 root)
	{
		if(root !=null)
		{
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
	
	public static TreeNode11 mergeTrees(TreeNode11 roota, TreeNode11 rootb)
	{
		if(roota == null) return rootb;
		if(rootb == null) return roota;
		roota.data += rootb.data;
		roota.left = mergeTrees(roota.left, rootb.left)	;
		roota.right = mergeTrees(roota.right, rootb.right);
		return roota;
		
	}

}
