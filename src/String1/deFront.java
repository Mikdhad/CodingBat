package String1;

public class deFront {
	/*
	 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


		deFront("Hello") → "llo"
		deFront("java") → "va"
		deFront("away") → "aay"
		
		https://codingbat.com/prob/p110141
	 */
	public String deFront(String str) {    
		  if(str.length()<2){
		    return str;
		  }
		  if(str.charAt(0)!='a'&&str.charAt(1)!='b'){
		     return str.substring(2,str.length());
		  }
		  if(str.charAt(0)!='a'){
		    return str.substring(1,str.length());
		  }
		  if(str.charAt(1)!='b'){
		    return str.charAt(0) + str.substring(2,str.length());
		  }
		  return str;
	}

}
