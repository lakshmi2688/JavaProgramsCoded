
package binarysearchtreeproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class TreeRoot2
{
	TreeRoot2 left,right;
	int data;
	public TreeRoot2(int data)
	{
		this.data = data;
		left = right = null;
	}
}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class ConvertSortedListToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("enter the number of elements in the list");
		int n = in.nextInt();
		Node head = printNode(n);
		Node sorted = sortList(head);
		Node headnode = sorted;
		sb.append(sorted.data);
		 while(sorted != null)
         {
			 sorted = sorted.next;
        	 if (sorted != null)
             {
                 sb.append("-->");
                 sb.append(sorted.data);
             }
         }
         System.out.println("Sorted Linkedlist: " + sb.toString());
         System.out.print("\n");
 		TreeRoot2 result = convertSortedListToBST(headnode);	
 		System.out.println("*******************");
 		System.out.println("Tree Node values are:");
 		inOrder(result);
	}
	
	public static Node printNode(int n)
	{
		Random rand = new Random();
		Node head = new Node(rand.nextInt(50));
		Node node = head;
		StringBuilder sb = new StringBuilder();
		sb.append(node.data);
		for(int i=0;i<n;i++)
		{
			node.next = new Node(rand.nextInt(100));
			node = node.next;
			if(node != null)
			{
				sb.append("-->");
				sb.append(node.data);
			}
					
		}
		System.out.println("Original List: " + sb.toString());
		return head;
		
	}
	
	public static TreeRoot2 convertSortedListToBST(Node head)
	{
		 if(head == null) return null;
	        
	        return helper(head,null);
	}
	
	public static TreeRoot2 helper(Node head, Node tail)
    {
		if(head == tail) return null;
		Node slow = head;
		Node fast = head;
	
		while(fast != tail && fast.next != tail)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeRoot2 node = new TreeRoot2(slow.data);
		node.left = helper(head,slow);
		node.right = helper(slow.next,tail);
		return node;
	}
	
	public static void inOrder(TreeRoot2 root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	 public static Node sortList(Node head) {
	        
	        if(head == null || head.next == null) return head;
	        
	        Node fast = head, slow = head;
	       Node prev = null;
	        while(fast != null && fast.next != null)
	        {
	            prev = slow;
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        prev.next = null;
	        Node l1 = sortList(slow);
	        Node l2 = sortList(head);
	        return mergeLists(l1, l2);
	        
	    }
	    
	    public static Node mergeLists(Node l1, Node l2)
	    {
	        
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        Node dummy = new Node(0);
	        Node prev = dummy;
	        
	        while(l1 != null  && l2 != null)
	        {
	            if(l1.data <= l2.data)
	            {
	                prev.next = l1;
	                l1 = l1.next;
	            }
	            else
	            {
	                prev.next = l2;
	                l2 = l2.next;
	            }
	            prev = prev.next;
	        }
	        
	        while(l1 != null)
	        {
	             prev.next = l1;
	                l1 = l1.next;
	             prev = prev.next;
	        }
	        while(l2 != null)
	        {
	            prev.next = l2;
	                l2 = l2.next;
	            prev = prev.next;
	        }
	        
	        return dummy.next;
	    }

}
