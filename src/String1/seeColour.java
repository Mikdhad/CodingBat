package String1;

public class seeColour {
	/*
	 * 
		Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
		
		
		seeColor("redxx") → "red"
		seeColor("xxred") → ""
		seeColor("blueTimes") → "blue"
		
		https://codingbat.com/prob/p199216
	 */
	public String seeColor(String str) {
		  if(str.equals("")||str.length()<3){
		    return "";
		  }
		  if(str.substring(0,3).equals("red")){
		    return "red";
		  }
		  if(str.length()>3 && str.substring(0,4).equals("blue")){
		    return "blue";
		  }
		  return "";
	}
}
