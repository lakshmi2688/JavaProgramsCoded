import java.util.Scanner;


/* Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x =in.nextInt();
		System.out.println("reversed integer: " +reverse(x));		

	}
	
	public static int reverse(int x) {
        
        int num =0;
        while(x != 0)
        {
            int tail = x % 10;
            int res = num * 10 + tail;
            if((res - tail)/10 != num)
            {
                return 0;
            }
            num = res;
            x = x/10;
        }
        
        return num;
        
    }

}
