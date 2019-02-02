package binarytreeproblems;


class TreeNode7
{
	TreeNode7 left, right;
	int data;
	public TreeNode7(int data)
	{
		left = right = null;
		this.data = data;
	}
}

public class MaxDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode7 root = printNode();
		int height = heightOfBST(root);
		System.out.println("Max depth of binary Tree: " +height);

	}
	
	public static int heightOfBST(TreeNode7 root)
	{
		if(root == null)
		{
			return 0;
		}
		int left = heightOfBST(root.left);
		int right = heightOfBST(root.right);
		return  Math.max(left, right) + 1;
	}
	
	public static TreeNode7 printNode()
	{
		TreeNode7 root = new TreeNode7(5);
		root.left = new TreeNode7 (3);
		root.right = new TreeNode7 (8);
		root.left.left = new TreeNode7 (2);
		root.left.right = new TreeNode7 (4);
		root.right.left = new TreeNode7 (7);
		root.right.right = new TreeNode7 (9);
		return root;
	}

}
