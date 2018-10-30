package String2;

public class countCode {
	/*
	 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


		countCode("aaacodebbb") → 1
		countCode("codexxcode") → 2
		countCode("cozexxcope") → 2
		
		https://codingbat.com/prob/p123614
	 */
	public static int countCode(String str) {
		  int count=0;
		  for (int i=0;i<str.length()&&i+4<str.length();i++){
			  if(str.substring(i,i+2).equals("co")&&str.charAt(i+3)=='e'){
		      count++;
		    }
		  }
		  return count;
		}
	
}
