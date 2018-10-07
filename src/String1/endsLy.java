package String1;

public class endsLy {
	/*
	 * Given a string, return true if it ends in "ly".


		endsLy("oddly") → true
		endsLy("y") → false
		endsLy("oddy") → false
		
		https://codingbat.com/prob/p103895
		
	 */
	public boolean endsLy(String str) {
		  return str.length()<2?false:(str.substring(str.length()-2,str.length()).equals("ly"))?true:false;
		}

}
