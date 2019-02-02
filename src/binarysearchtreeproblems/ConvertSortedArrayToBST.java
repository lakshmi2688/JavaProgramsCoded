package binarysearchtreeproblems;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TreeRoot1
{
	TreeRoot1 left,right;
	int data;
	public TreeRoot1(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class ConvertSortedArrayToBST {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n = in.nextInt();
		int[] arr = new int[n];
		Random rand = new Random();
		for(int i=0;i<n;i++)
		{
			arr[i] = rand.nextInt(50);
		}
		System.out.println("Sorted array elements are");
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");			
		}
		System.out.print("\n");
		TreeRoot1 result = convertSortedArrToBST(arr);	
		System.out.println("*******************");
		System.out.println("Node values are:");
		inOrder(result);
	}
	
	public static TreeRoot1 convertSortedArrToBST(int[] nums)
	{
		if(nums == null || nums.length == 0) return null;      
		return helper(nums,0,nums.length-1);
	}
	
	public static TreeRoot1 helper(int[] nums, int start, int end)
	{
		if(start > end) return null;
		int mid = start + (end - start)/2;
		TreeRoot1 node = new TreeRoot1(nums[mid]);
		node.left = helper(nums,start,mid-1);
		node.right = helper(nums,mid+1,end);
		return node;
	}
	
	public static void inOrder(TreeRoot1 root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	
	

}
