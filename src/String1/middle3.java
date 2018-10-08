package String1;

public class middle3 {
	/*
	 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


		middleThree("Candy") → "and"
		middleThree("and") → "and"
		middleThree("solving") → "lvi"
		
		https://codingbat.com/prob/p115863
	 */
	public String middleThree(String str) {
		  return str.substring((str.length()/2)-1,(str.length()/2)+2);
	}
}
