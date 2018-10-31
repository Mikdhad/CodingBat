package String2;

public class endOther {
	/*
	 * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


		endOther("Hiabc", "abc") → true
		endOther("AbC", "HiaBc") → true
		endOther("abc", "abXabc") → true
		
		https://codingbat.com/prob/p126880
	 */
	public boolean endOther(String a, String b) {
		  a=a.toLowerCase();
		  b=b.toLowerCase();
		  if(a.length()>b.length()){
		    if(a.substring(a.length()-b.length(),a.length()).equals(b)){
		      return true;
		    }
		    return false;
		  }
		  if(b.substring(b.length()-a.length(),b.length()).equals(a)){
		      return true;
		    }
		    return false;
		}

}
