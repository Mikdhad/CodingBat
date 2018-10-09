package String1;

public class withoutX2 {
	/*
	 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


		withoutX2("xHi") → "Hi"
		withoutX2("Hxi") → "Hi"
		withoutX2("Hi") → "Hi"
		
		https://codingbat.com/prob/p151359
	 */
	public String withoutX2(String str) {
		  if (str.length()<1){
		    return str;
		  }
		  if(str.length()>1&&str.charAt(0)=='x'&&str.charAt(1)=='x'){
		    return str.substring(2,str.length());
		  }
		  if(str.charAt(0)=='x'){
		    return str.substring(1,str.length());
		  }
		  if(str.charAt(1)=='x'){
		    return str.charAt(0)+ "" +str.substring(2,str.length());
		  }
		  return str;
	}

}
