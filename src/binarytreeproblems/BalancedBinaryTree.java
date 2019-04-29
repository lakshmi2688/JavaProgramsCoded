package binarytreeproblems;

class TreeNode5
{
	int data;
	TreeNode5 left, right;
	public TreeNode5(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class BalancedBinaryTree {

	public static void main(String[] args) {
		//TreeNode5 root = printNode();
		TreeNode5 root = printNode1();
		boolean res = isBalanced(root);
		System.out.println("Is the tree balanced: " +res);

	}
	
	//Balanced tree
	public static TreeNode5 printNode()
	{
		TreeNode5 root = new TreeNode5(5);
		root.left  = new TreeNode5(3);
		root.left.left  = new TreeNode5(2);
		root.left.right  = new TreeNode5(4);
		root.right  = new TreeNode5(8);
		root.right.left  = new TreeNode5(7);
		root.right.right  = new TreeNode5(9);
		return root;
	}
	
	
	//Non-Balanced tree
	public static TreeNode5 printNode1()
	{
		TreeNode5 root = new TreeNode5(1);
		root.left  = new TreeNode5(2);
		root.left.left  = new TreeNode5(3);
		root.left.left.left  = new TreeNode5(4);
		root.right  = new TreeNode5(2);
		root.right.right  = new TreeNode5(3);
		root.right.right.right  = new TreeNode5(4);
		return root;
	}
	
	
	public static boolean isBalanced(TreeNode5 root) {
        
        if(root == null) return true;
        return maxDepth(root) != -1;       
        
    }
    
    
    public static int maxDepth(TreeNode5 root)
    {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        //non-balanced tree, left or right will be -1
        if(left == -1) return -1;
        int right = maxDepth(root.right);
      //non-balanced tree, left or right will be -1
        if(right == -1) return -1;
        if(Math.abs(right - left) > 1) return -1;
        return 1+Math.max(left,right);
    }

}
