package String1;

public class firstTwo {
	/*
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


		firstTwo("Hello") → "He"
		firstTwo("abcdefg") → "ab"
		firstTwo("ab") → "ab"
		
		https://codingbat.com/prob/p163411
	 */
	
	public String firstTwo(String str) {
		  if(str.length()==0){
		    return "";
		  }
		  if (str.length()<3){
		    return str;
		  }
		  return str.substring(0,2);
		}

}
