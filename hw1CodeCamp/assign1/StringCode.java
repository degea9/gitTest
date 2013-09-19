package assign1;

import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run. A a run is a
	 * series of adajcent chars that are the same.
	 * 
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int j = 1, length = 1;
		if (str.length() == 0)
			return 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {

				j++;
				if (j > length)
					length = j;
			} else
				j = 1;
		}
		return length;

	}

	/**
	 * Given a string, for each digit in the original string, replaces the digit
	 * with that many occurrences of the character following. So the string
	 * "a3tx2z" yields "attttxzzz".
	 * 
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		// char[] digit = {'0','1','2','3','4','5','6','7','8','9'};
		int v = 0;
		StringBuilder str1 = new StringBuilder("");
		StringBuilder returnString = new StringBuilder("");
		for (int i = 0; i < str.length() ; i++) {

			if (Character.isDigit(str.charAt(i))) {
				str1.append(str.charAt(i));
			} else {
				if(str1.length()!=0) {
					v = Integer.parseInt(str1.toString());
					for(int j=0 ;j<v;j++) returnString.append(str.charAt(i));
					str1.setLength(0);
				}
				returnString.append(str.charAt(i));
				
			}
		}
		
		return returnString.toString();
	}

	/**
	 * Given 2 strings, consider all the substrings within them of length len.
	 * Returns true if there are any such substrings which appear in both
	 * strings. Compute this in linear time using a HashSet. Len will be 1 or
	 * more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		return false; // TO DO ADD YOUR CODE HERE
	}
}
