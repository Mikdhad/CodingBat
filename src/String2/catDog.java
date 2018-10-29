package String2;

public class catDog {
	/*
	 * 
		Return true if the string "cat" and "dog" appear the same number of times in the given string.
		
		
		catDog("catdog") → true
		catDog("catcat") → false
		catDog("1cat1cadodog") → true
		
		https://codingbat.com/prob/p111624
	 */
	public boolean catDog(String str) {
		  int cat = 0;
		  int dog = 0;
		  for(int i=0;i<str.length()&&i+2<str.length();i++){
		    if(str.substring(i,i+3).equals("cat")){
		      cat++;
		    }
		    else if(str.substring(i,i+3).equals("dog")){
		      dog++;
		    }
		  }
		  return cat==dog;
	}
	
}
