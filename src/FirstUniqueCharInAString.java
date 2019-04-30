 import java.util.*;

/* Given a string, find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.*/

public class FirstUniqueCharInAString {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = in.nextLine();
		int idx = getIndex(s);
		System.out.println("index is : " +idx);
		
	}
	
	
	public static int getIndex(String s)
	{
		
		if(s == null || s.length() == 0) return -1;
		Map<Character,Integer>  map = new LinkedHashMap<Character,Integer>();
		for(char c: s.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return s.indexOf(entry.getKey());
			}
		}
		
		return -1;
		
	}

}
