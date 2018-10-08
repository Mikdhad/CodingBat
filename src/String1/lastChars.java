package String1;

public class lastChars {
	/*
	 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


		lastChars("last", "chars") → "ls"
		lastChars("yo", "java") → "ya"
		lastChars("hi", "") → "h@"
		
		https://codingbat.com/prob/p138183
	 */
	public String lastChars(String a, String b) {
		  if(a.equals("")&&b.equals("")){
		    return "@@";
		  }
		  if(a.equals("")){
		    return"@"+b.charAt(b.length()-1);
		  }
		  if(b.equals("")){
		    return a.charAt(0)+"@";
		  }
		  return a.charAt(0)+ ""+b.charAt(b.length()-1);
		}

}
