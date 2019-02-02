package NaryTreeProblems;

import java.util.ArrayList;
import java.util.List;

class TreeNode
{
	ArrayList<TreeNode> children;
	int data;
	public TreeNode(int data)
	{
		this.data = data;
		children = new ArrayList();
	}
}

public class MaxDepthOfNaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = printNode();
		int height = heightOfNaryT(root);
		System.out.println("Max depth of Nary Tree: " +height);

	}
	
	public static int heightOfNaryT(TreeNode root)
	{
		if(root == null) return 0;
		//if(root == null) return -1;
        if(root.children.size() == 0) return 1;
        //if(root.children.size() == 0) return 0;
		
		int max =0;
		for(int i=0;i<root.children.size();i++)
		{
			max = Math.max(max, heightOfNaryT(root.children.get(i)));
		}
		return 1+max;
		
	}
	
	public static TreeNode printNode()
	{
		TreeNode root = new TreeNode(1);
		root.children.add(new TreeNode(3));
		root.children.add(new TreeNode(2));
		root.children.add(new TreeNode(4));
		root.children.get(0).children.add(new TreeNode(5));
		root.children.get(0).children.add(new TreeNode(6));
		return root;
	}

}
