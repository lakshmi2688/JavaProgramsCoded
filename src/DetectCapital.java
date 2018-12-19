import java.util.Scanner;

/* Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
*/

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		boolean result = detectCapitalUse(str);
		System.out.println("result :" +result);
	}
	
	
	public static boolean detectCapitalUse(String word) {
		if(word == null || word.length() == 0) return false;
		int count = 0;
		for(char c: word.toCharArray())
		{
			if(c >= 'A' && c <= 'Z')
			{
				count++;
			}
		}
		return count == 0 || count == word.length() || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
	}

}
