import java.util.Scanner;

/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int x =in.nextInt();
		System.out.println("Palindrome number: " +isPalindrome(x));

	}

	
	public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int num =0;
        int y = x;
        while(x != 0)
        {
            int tail = x % 10;
            if(tail < 0 || tail > 9) break;
            int res = num * 10 + tail;
            if((res - tail)/10 != num)
            {
                return false;
            }
            num = res;
            x = x/10;
        }
        
        return y == num;
        
    }
}
