package String2;

public class xyzThere {
	/*
	 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


		xyzThere("abcxyz") → true
		xyzThere("abc.xyz") → false
		xyzThere("xyz.abc") → true
		
		https://codingbat.com/prob/p136594
	 */
	public boolean xyzThere(String str) {
		  for(int i=0;i<str.length()&&i+3<=str.length();i++){
		    if(str.charAt(i)=='.'){
		      i++;
		    }
		    else if(str.substring(i,i+3).equals("xyz")){
		      return true;
		    }
		  }
		  return false;
		}

}
