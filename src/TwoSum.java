import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = in.nextInt();
		System.out.println("Enter the target");
		int target = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int[] res = twoSum(arr,target);
		for(int num : res)
		{
			System.out.println("index: " +num);
		}

	}
	
	
	public static int[] twoSum(int[] nums, int target) 
	{
		if(nums == null || nums.length == 0)return new int[0];
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int complement = target - nums[i];
			if(!map.containsKey(complement))
			{
				map.put(nums[i], i);
			}
			else
			{
				return new int[]{map.get(complement),i};
			}
		}
		throw new IllegalArgumentException("sum not found");
	}

}
