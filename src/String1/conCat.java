package String1;

public class conCat {
	/*
	 * Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


		conCat("abc", "cat") → "abcat"
		conCat("dog", "cat") → "dogcat"
		conCat("abc", "") → "abc"
		
		https://codingbat.com/prob/p132118
	 */
	public String conCat(String a, String b) {
		  return a.equals("")?b:b.equals("")?a:a.charAt(a.length()-1)==b.charAt(0)?a.substring(0,a.length()-1)+b:a+b;
	}

}
