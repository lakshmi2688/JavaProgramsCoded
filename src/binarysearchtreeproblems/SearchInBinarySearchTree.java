package binarysearchtreeproblems;
/*1) the maximum number of nodes on any level l = 2^(l-1)
 * For root, l = 1, number of nodes = 2 power(1-1) = 1
 * 2) max number of nodes = 2h-1 
 * 3) height = O(log(n))
 * 
Algorithm	Average	    Worst Case
Space		O(n)	    O(n)
Search		O(log n)	O(n)
Insert		O(log n)	O(n)
Delete		O(log n)	O(n)


Given a binary search tree and a key, return node which has data as this key or return
 * null if no node has data as key.
 * 
 * Solution 
 * Since its BST for every node check if root.data is key and if not go either left or
 * right depending on if root.data is greater or less than key
 * 
 * Time complexity is O(n) for non-balanced BST
 * Time complexity is O(logn) for balanced BST
 * 
 * Test cases:
 * 1) null tree
 * 2) Tree with one node and key is that node
 * 3) Tree with many nodes and key does not exist
 * 4) Tree with many nodes and key exists
 * 
 * 
 * The tree is only balanced if:
The left and right subtrees' heights differ by at most one, AND
The left subtree is balanced, AND
The right subtree is balanced

According to this, the next tree is balanced:

     A
   /   \
  B     C  
 /     / \  
D     E   F  
     /  
    G  
The next one is not balanced because the subtrees of C differ by 2 in their height:

     A
   /   \
  B     C   <-- difference = 2
 /     /
D     E  
     /  
    G  
 The "height" of a node in a binary tree is the length of the longest path from that node to a leaf.
    
    
    For example, root's left child is null:

              A  (Height = 2)
           /     \
(height =-1)       B (Height = 1) <-- Unbalanced because 1-(-1)=2 >1
                    \
                     C (Height = 0)
                     
                     
   A Balanced Tree Example:

        A (h=3)
     /     \
 B(h=1)     C (h=2)        
/          /   \
D (h=0)  E(h=0)  F (h=1)
               /
              G (h=0)
              
              
              
    Not A Balanced Tree Example:

        A (h=3)
     /     \
 B(h=0)     C (h=2)        <-- Unbalanced: 2-0 =2 > 1
           /   \
        E(h=1)  F (h=0)
        /     \
      H (h=0)   G (h=0) 
 * */
class Root
{
	int data;
	Root left, right;
	public Root(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class SearchInBinarySearchTree {
	
	public static void main(String[] args)
	{
		//int searchData = 4;
		int searchData = 10;
		Root root = printNode();
		Root searchRoot = search(root,searchData);
		System.out.println("searchdata: " +searchData);
		if(searchRoot != null)
		{
		System.out.println("result: " +searchRoot.data);
		}
		else
		{
			System.out.println("Search data " + searchData + " not found");
		}
		
		assert searchRoot.data == searchData;
	}	
	
	
	public static Root printNode()
	{
		Root root = new Root (5);
		root.left = new Root (3);
		root.right = new Root (8);
		root.left.left = new Root (2);
		root.left.right = new Root (4);
		root.right.left = new Root (7);
		root.right.right = new Root (9);
		return root;
	}
	
	public static Root search(Root root, int searchData)
	{
		//if searchData does not xist, it returns null
		if(root == null) 
		{
			return null;
		}
		
		//if search data exists, returns root
		if(root.data == searchData)
		{
			return root;
		}
		else if(root.data < searchData)
		{
			return search(root.right,searchData);
		}
		else if(root.data > searchData)
		{
			return search(root.left,searchData);
		}
		
		return null;
		
		
	}

}
