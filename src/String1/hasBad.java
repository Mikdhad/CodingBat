package String1;

public class hasBad {
	/*
	 * 
		Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
		
		
		hasBad("badxx") → true
		hasBad("xbadxx") → true
		hasBad("xxbadxx") → false
		
		https://codingbat.com/prob/p139075
	 */
	public boolean hasBad(String str) {
		  return str.length()<3?false:(str.substring(0,3).equals("bad")||(str.length()>3 && (str.substring(1,4).equals("bad"))))?true:false;
	}

}
