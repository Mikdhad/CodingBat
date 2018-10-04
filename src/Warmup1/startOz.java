
public class startOz {
	/**
	 * 
		Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
		
		startOz("ozymandias") → "oz"
		startOz("bzoo") → "z"
		startOz("oxx") → "o"
		
		https://codingbat.com/prob/p199720
	 */
	public String startOz(String str) {
		  String word = "";
		  if (str.length()>=1 && str.charAt(0)=='o'){
		    word = word + "o";
		  }
		  if (str.length()>=2&&str.charAt(1)=='z'){
		    word = word + "z";
		  }
		  return word;
		}

}
