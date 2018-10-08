package String1;

public class lastTwo {
	/*
	 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


		lastTwo("coding") → "codign"
		lastTwo("cat") → "cta"
		lastTwo("ab") → "ba"
		
		https://codingbat.com/prob/p194786
	 */
	public String lastTwo(String str) {
		  return str.length()<2?str:str.substring(0,str.length()-2)+str.charAt(str.length()-1)+""+str.charAt(str.length()-2);
	}
}
