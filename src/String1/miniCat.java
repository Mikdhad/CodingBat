package String1;

public class miniCat {
	/*
	 * Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


		minCat("Hello", "Hi") → "loHi"
		minCat("Hello", "java") → "ellojava"
		minCat("java", "Hello") → "javaello"
		
		https://codingbat.com/prob/p105745
	 */
	public String minCat(String a, String b) {
		  String longer = a;
		  String shorter = b;
		  if(a.length()>b.length()){
		    return a.substring(a.length()-b.length(),a.length())+b;
		  }
		  if(a.length()==b.length()){
		    return a+b;
		  }
		  return a + b.substring(b.length()-a.length(),b.length());
	}

}
