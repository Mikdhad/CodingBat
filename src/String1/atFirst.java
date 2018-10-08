package String1;

public class atFirst {
	/*
	 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


		atFirst("hello") → "he"
		atFirst("hi") → "hi"
		atFirst("h") → "h@"
		
		https://codingbat.com/prob/p139076
	 */
	public String atFirst(String str) {
		  return str.length()==1?str+"@":(str.length()<1)?"@@":str.substring(0,2);
	}

}
