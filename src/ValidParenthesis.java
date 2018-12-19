import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		boolean validity= isValid(str);
		System.out.println("validity of the string: "+validity);
	}
	
	public static boolean isValid(String str)
	{
		if(str == null || str.isEmpty())return false;
		Stack<Character> st = new Stack<Character>();
		for(char c:str.toCharArray())
		{
			if(c == '{')
				st.push('}');
			else if(c == '(')
				st.push(')');
			else if(c == '[')
				st.push(']');
			else if(st.isEmpty() || st.pop() != c)
				return false;
		}
		return st.isEmpty();
	}

}
