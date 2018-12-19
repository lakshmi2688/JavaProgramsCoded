import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		String revStr = reverseStr(arr, left, right);
		System.out.println("Reversed str is: " +revStr);
	}
	
	
	public static String reverseStr(char[] arr, int left, int right)
	{
		
		while(left < right)
		{
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
		
	}

}
