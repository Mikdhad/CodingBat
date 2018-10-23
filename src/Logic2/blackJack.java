package Logic2;

public class blackJack {
	/*
	 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


		blackjack(19, 21) → 21
		blackjack(21, 19) → 21
		blackjack(19, 22) → 19
		
		https://codingbat.com/prob/p117019
	 */
	
	public int blackjack(int a, int b) {
		  if(a>21&&b>21){
		    return 0;
		  }
		  if(a>21||b>21){
		    return a>21?b:a;
		  }
		  if(21-a<21-b){
		    return a;
		  }
		  return b;
	}
}
