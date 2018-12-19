import java.util.Scanner;

/*Given a string and an integer k, you need to reverse the first k characters
 *  for every 2k characters counting from the start of the string. If there are 
 *  less than k characters left, reverse all of them. If there are less than 2k 
 *  but greater than or equal to k characters, 
 * then reverse the first k characters and left the other as original.*/

public class ReverseStringWithIntK {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		System.out.println("Enter k");
		int k = in.nextInt();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i+=2*k)
		{
			int left = i;
			int right = Math.min(i+k-1, arr.length-1);
			reverseStr(arr,left,right);
		}
		
		System.out.println("Reversed string is : "+ new String(arr));
	}
	
	public static void reverseStr(char[] arr, int left, int right)
	{
		
		while(left < right)
		{
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		
	}

}
