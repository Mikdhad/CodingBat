package String1;

public class middleTwo {
	/*
	 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


		middleTwo("string") → "ri"
		middleTwo("code") → "od"
		middleTwo("Practice") → "ct"
		
		https://codingbat.com/prob/p137729
	 */
	public String middleTwo(String str) {
		  int half = str.length()/2;
		  return str.length()<3?str:str.substring(half-1,half+1);
	}
}
