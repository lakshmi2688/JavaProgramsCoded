import java.util.Scanner;

/*Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.*/
public class AddStrings {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1");
		String str1 = in.nextLine();
		System.out.println("Enter string 2");
		String str2 = in.nextLine();
		String res = addStrings(str1,str2);
		System.out.println("Added string is : "+res);
	}
	
	public static String addStrings(String str1, String str2)
	{
		if(str1.isEmpty()) return str2;
		if(str2.isEmpty()) return str1;
		StringBuilder sb = new StringBuilder();
		int carry = 0,sum = 0;
		int i = str1.length() - 1;
		int j = str2.length() - 1;
		//one str could be longer than other string, therefore ||
        while(i >= 0 || j >= 0)
		{
			sum = carry;
			if(i >= 0)
			{
				sum += str1.charAt(i) - '0';
				i--;
			}
			
			if(j >= 0)
			{
				sum += str2.charAt(j) - '0';
				j--;
			}
			
			carry = sum/10;
			sb.append(sum % 10);
		}
		if(carry > 0)
		{
			sb.append(carry);
		}
		
		return sb.reverse().toString();
	}
	
	
	

}
