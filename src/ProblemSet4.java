/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.lang.Math;

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 pset4 = new ProblemSet4();
		
		pset4.testFunctions();
	}
	
	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	// your method signature here
	public String surroundMe(String out, String in) {
		if (out == null || in == null) return null;
		
		if (out.length() != 4 || in.length() != 3) return null;
		
		return out.substring(0, 2) + in + out.substring(2);
		
	}
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	// your method signature here
	public String endsMeet(String str, int n) {
		if (str == null) return null;
		
		int length = str.length();
		
		if (length < 1 || length > 10 || n > length || n < 1) return null;
		
		return str.substring(0, n) + str.substring(length - n, length);
	}
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	// your method signature here
	public String middleMan(String str) {
		
		int length = str.length();
		
		if (length % 2 == 0 || str == null || length < 3) return null;
		
		return str.substring(length / 2 - 1, length / 2 + 2);
		// middle 3 characters
	}
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	// your method signature here
	public String doubleVision(String str) {
		if (str == null) return null; 
		
		int length = str.length();
		
		if (length < 1) return null;
		
		String newStr = "";
		
		for (int x = 0; x < length; x++) {
			newStr += str.charAt(x) + "" + str.charAt(x);
			// combines two existing positions
		}
		return newStr;
	}
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */
	
	// your method signature here
	public boolean centered(String str, String target) {
		if (str == null || target == null) return false;
		
		int strLength = str.length(), targetLength = target.length();
		
		if (targetLength != 3 || strLength < 3) return false;
		
		
		return str.substring(strLength / 2 - 1, strLength / 2 + 2).equals(target);
	}
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	// your method signature here
	public int upOrDown(double number, char operation) {
		
		switch(operation) {
			case 'r':
				return (int) Math.round(number);
			case 'f':
				return (int) Math.floor(number);
			case 'c':
				return (int) Math.ceil(number);
			default:
				return -1;
		}
		
	}
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	// your method signature here
	public int countMe(String text, char end) {
		
		if (!Character.isAlphabetic(end) || text == null) return -1;
		// null or not in [Aa-Zz]
		
		int length = text.length(), sum = 0;
		// variables -- length created for simplicity
		
		for (int x = 0; x < length - 1; x++) {
			if (!Character.isAlphabetic(text.charAt(x)) && 
			!Character.isWhitespace(text.charAt(x))) {
				return -1;
				// checks to see if alphabetic / whitespace  
			}
			else if (text.charAt(x) == end && Character.isWhitespace(text.charAt(x + 1))) {
				sum++;
			}
		}
		 
		if (!Character.isAlphabetic(text.charAt(length - 1)) &&
			!Character.isWhitespace(text.charAt(length - 1))) {
				return -1;
		}
		// this is for the last letter, in order not to get an out of bounds error
		
		else if (text.charAt(length - 1) == end) sum++;	
		
		return ((sum > 0) ? sum : -1);
	}
		
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	// your method signature here
	public boolean isNotEqual(String str) {
		if (str == null) return false;
		
		int isSum = 0, notSum = 0;
		// counters
		
		for (int x = 0; x < str.length() - 1; x++) {
			if (str.substring(x, x + 2).equals("is")) {
				isSum++;
				// checks substring for "is" and adds if true
			}
			else if (x < str.length() - 2) {
				if (str.substring(x, x + 3).equals("not")) {
					notSum++;
					// same logic for "not," provided not the last two chars
				}
			}
		}
		return isSum == notSum;
	}
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	
	// your method signature here
	public int triplets(String str) {
		
		if (str == null) return -1;
		int sum = 0, length = str.length();
		
		for (int x = 0; x < length - 2; x++) {
			if(!Character.isAlphabetic(str.charAt(x))) return -1;
			
			else if (str.charAt(x) == str.charAt(x + 1) && str.charAt(x) == str.charAt(x + 2))
				sum++;
				// checks if A = B and B = C (so then A = C)
		}
		if (!Character.isAlphabetic(str.charAt(length - 1)) ||
			!Character.isAlphabetic(str.charAt(length - 2))) {
				return -1;
				// last two chars have to be alphabetic
		}
		
		return sum;
	}
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifcations are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	// your method signature here
	public int addMe(String str, boolean digits) {
		if (str == null) return -1;
		int sum = 0, value = 0;
		for (int x = 0; x < str.length(); x++) {
			
			if (!Character.isAlphabetic(str.charAt(x)) && !Character.isDigit(str.charAt(x))) {
				return -1;
				// disqualified if not alphanumeric 
			}
			
			else if (digits) {
				if (Character.isDigit(str.charAt(x))) {
					sum += str.charAt(x) - '0';
					// adds digit to total sum
				}
				else continue;
				// next iterations
			}
			else {
				if (Character.isDigit(str.charAt(x))) {
					value *= 10;
					value += str.charAt(x) - '0';
				}
				else {
					sum += value;
					value = 0;
				}
			}
		}
		sum += value;
		return sum; 
	}
	
	public void testFunctions() {
		System.out.println(surroundMe("<<>>", "abc"));
		System.out.println(surroundMe("[[]]", "xyz"));
		System.out.println(surroundMe("abc", "abc"));
		System.out.println(surroundMe("(())", "qwerty"));
		System.out.println(surroundMe(null, "abc"));
		System.out.println(surroundMe("<<>>", null));
		System.out.println("\n");
		
		System.out.println(endsMeet("qwerty", 2));
		System.out.println(endsMeet("basketball", 3));
		System.out.println(endsMeet("qwerty", -1));
		System.out.println(endsMeet("basketball", 0));
		System.out.println(endsMeet("qwerty", 9));
		System.out.println(endsMeet("programming", 2));
		System.out.println(endsMeet(null, 1));
		System.out.println("\n");
		
		System.out.println(doubleVision("qwerty"));
		System.out.println(doubleVision("a"));
		System.out.println(doubleVision(null));
		System.out.println("\n");
		
		System.out.println(centered("candy", "and"));
		System.out.println(centered("programming", "ram"));
		System.out.println(centered("qwerty", "qwe"));
		System.out.println(centered("qwerty", "er"));
		System.out.println(centered("qwerty", null));
		System.out.println(centered(null, "abc"));
		System.out.println(centered(null, null));
		System.out.println("\n");
		
		System.out.println(upOrDown(12.7, 'r'));
		System.out.println(upOrDown(12.2, 'r'));
		System.out.println(upOrDown(12.7, 'f'));
		System.out.println(upOrDown(12.2, 'c'));
		System.out.println(upOrDown(12.7, 'x'));
		System.out.println("\n");
		
		System.out.println(countMe("these are just some sample words", 'e'));
		System.out.println(countMe(null, 'n'));
		System.out.println(countMe("and some more sample words", '+'));
		System.out.println(countMe("one more batch of sample words", 'h'));
		System.out.println("\n");
		
		System.out.println(isNotEqual("is not is not is"));
		System.out.println(isNotEqual("is not is not is not"));
		System.out.println(isNotEqual(null));
		System.out.println("\n");
		
		System.out.println(triplets("abbbccccd"));
		System.out.println(triplets("aaabbbbccccc"));
		System.out.println(triplets(null));
		System.out.println(triplets("abbb1ccc"));
		System.out.println(triplets("aaa bbb"));
		System.out.println("\n");
		
		System.out.println(addMe("a123b456c789", true));
		System.out.println(addMe("a123b456c789", false));
		System.out.println(addMe(null, true));
		System.out.println(addMe("abc 123 def", false));
	}
}