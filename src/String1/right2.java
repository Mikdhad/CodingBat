package String1;

public class right2 {
	/*
	 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


		right2("Hello") → "loHel"
		right2("java") → "vaja"
		right2("Hi") → "Hi"
		
		https://codingbat.com/prob/p130781
	 */
	public String right2(String str) {
		  return str.length()<3?str:str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
	}

}
