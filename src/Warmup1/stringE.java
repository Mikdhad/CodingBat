
public class stringE {
	/*
	 * Return true if the given string contains between 1 and 3 'e' chars.


		stringE("Hello") → true
		stringE("Heelle") → true
		stringE("Heelele") → false
		
		https://codingbat.com/prob/p173784
	 */
	public boolean stringE(String str) {
		 int e = 0;
		 for(int i=0;i<str.length();i++){
		   if(str.charAt(i)=='e'){
		     e++;
		   }
		   if(e==4){
		     return false;
		   }
		 }
		 return e>=1 && e<=3?true:false;
	}
}
