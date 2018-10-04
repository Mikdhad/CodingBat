package Warmup2;

public class stringX {
	/*
	 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


		stringX("xxHxix") → "xHix"
		stringX("abxxxcd") → "abcd"
		stringX("xabxxxcdx") → "xabcdx"
		
		https://codingbat.com/prob/p171260
	 */
	public String stringX(String str) {
		  String word = "";
		  if(str.length()>2){
		  
		    return  str.charAt(0) + str.substring(1,str.length()-1).replace("x","") + str.charAt(str.length()-1);
		  }
		    return str;
	}

}
