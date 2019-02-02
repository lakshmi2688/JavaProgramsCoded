package binarytreeproblems;

import java.util.LinkedList;
import java.util.List;

class TreeNode6
{
	int data;
	TreeNode6 left, right;
	public TreeNode6(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class AllRootToLeafPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode6 root = printNode();
		List<Integer> list = new LinkedList<Integer>();
		List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
		int sum = 22;
		allPathSum(root,sum, list, wraplist);
			for(List<Integer> item: wraplist)
			{
				
				System.out.println("path is : " + item);
			}
	}
	
	 public static void allPathSum(TreeNode6 root, int sum,List<Integer> list, List<List<Integer>> result)
	    {
	        if(root == null) return;
	         list.add(root.data);
	        if(root.left == null && root.right == null && sum == root.data)
	        {
	               result.add(new LinkedList(list));	                    
	        }
	    
	         if(root.left != null || root.right != null)
	            {
	                  allPathSum(root.left, sum-root.data, list, result);
	                  allPathSum(root.right, sum-root.data, list, result);
	            }
	    
	        list.remove(list.size() - 1);
	        
	    }
	
	
	public static TreeNode6 printNode()
	{
		TreeNode6 root = new TreeNode6(5);
		root.left  = new TreeNode6(4);
		root.left.left  = new TreeNode6(11);
		root.left.left.left  = new TreeNode6(7);
		root.left.left.right  = new TreeNode6(2);
		root.right  = new TreeNode6(8);
		root.right.left  = new TreeNode6(13);
		root.right.right  = new TreeNode6(4);
		root.right.right.left  = new TreeNode6(5);
		root.right.right.right  = new TreeNode6(1);
		return root;
	}
	

}
