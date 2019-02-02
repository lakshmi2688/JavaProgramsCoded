package binarytreeproblems;


class TreeNode8
{
	TreeNode8 left, right;
	int data;
	public TreeNode8(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class MinDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode8 root = printNode1();
		TreeNode8 root = printNode();
		int height = heightOfBST(root);
		System.out.println("Min depth of binary Tree: " +height);

	}
	
	public static int heightOfBST(TreeNode8 root)
	{
		if(root == null)
		{
			return 0;
		}
		int left = heightOfBST(root.left);
		int right = heightOfBST(root.right);
		if(root.left == null) return (1 + right);
		if(root.right == null) return (1 + left);
		return  Math.min(left, right) + 1;
	}
	
	public static TreeNode8 printNode()
	{
		TreeNode8 root = new TreeNode8(5);
		root.left = new TreeNode8 (3);
		root.right = new TreeNode8 (8);
		root.left.left = new TreeNode8 (2);
		root.left.right = new TreeNode8 (4);
		root.right.left = new TreeNode8 (7);
		root.right.right = new TreeNode8 (9);
		return root;
	}
	
	public static TreeNode8 printNode1()
	{
		TreeNode8 root = new TreeNode8(1);
		root.left = new TreeNode8 (2);
		root.left.left = new TreeNode8 (3);
		return root;
	}

}
