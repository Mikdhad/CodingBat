package Warmup2;

public class doubleX {
	/*
	 * 
		Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
		
		
		doubleX("axxbb") → true
		doubleX("axaxax") → false
		doubleX("xxxxx") → true
		
		https://codingbat.com/prob/p186759
	 */
	boolean doubleX(String str) {
		  if(str.indexOf('x')+1>str.length()-1 || str.charAt(str.indexOf('x')+1)!='x'){
		    return false;
		  }
		  return true;
	}

}
