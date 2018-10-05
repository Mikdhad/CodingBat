package Warmup2;

public class stringMatch {
	/*
	 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


		stringMatch("xxcaazz", "xxbaaz") → 3
		stringMatch("abc", "abc") → 2
		stringMatch("abc", "axc") → 0
		
		https://codingbat.com/prob/p198640
	 */
	public int stringMatch(String a, String b) {
		  int count = 0;
		  String small = a;
		  String big = b;
		  if(b.length()<a.length()){
		    small = b;
		    big = a;
		  }
		  for (int i = 0;i<small.length()-1;i++){
		    String sub1 = small.substring(i,i+2);
		    String sub2 = big.substring(i,i+2);
		    if (sub1.equals(sub2)){
		      count++;
		    }
		  }
		  return count;
		}

}
