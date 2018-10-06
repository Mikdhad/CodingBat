package String1;

public class extraEnd {
	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


		extraEnd("Hello") → "lololo"
		extraEnd("ab") → "ababab"
		extraEnd("Hi") → "HiHiHi"
		
		https://codingbat.com/prob/p108853
	 */
	public String extraEnd(String str) {
		  String word = str.substring(str.length()-2,str.length());
		  return word + word + word;
	}

}