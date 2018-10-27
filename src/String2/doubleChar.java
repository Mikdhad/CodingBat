package String2;

public class doubleChar {
	/*
	 * 
		Given a string, return a string where for every char in the original, there are two chars.
		
		
		doubleChar("The") → "TThhee"
		doubleChar("AAbb") → "AAAAbbbb"
		doubleChar("Hi-There") → "HHii--TThheerree"
		
		https://codingbat.com/prob/p165312
	 */
	public String doubleChar(String str) {
		  String dub = "";
		  for (int i=0;i<str.length();i++){
		    dub = dub + str.charAt(i) + str.charAt(i);
		  }
		  return dub;
	}

}
