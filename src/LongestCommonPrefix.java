import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = in.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the string elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextLine();
		}
		String pfx = longestCommonPrefix(arr);
		System.out.println("Longest common prefix is: " + pfx);

	}
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
        
    }

}
