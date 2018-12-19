import java.util.Scanner;

public class StringToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		String res  = convertToLowercase(str);
		System.out.println("lower case string is: " +res);

	}
	
	public static String convertToLowercase(String s)
	{
		if(s == null || s.isEmpty()) return "";
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray())
		{
			if(c >= 'A' && c <= 'Z')
			{
				char var = (char)((int)c + 32);
				sb.append(var);
			}
			else
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
