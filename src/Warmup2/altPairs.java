package Warmup2;

public class altPairs {
	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


		altPairs("kitten") → "kien"
		altPairs("Chocolate") → "Chole"
		altPairs("CodingHorror") → "Congrr"
		
		https://codingbat.com/prob/p121596
	 */
	public String altPairs(String str) {
		  String word = "";
		 for(int i =0; i<str.length(); i = i+4){
		   if(i+1>str.length()-1){
		     word = word + str.charAt(i);
		     break;
		   }
		   word = word + str.charAt(i) + str.charAt(i+1);
		 }
		 return word;
		  
		}

}
