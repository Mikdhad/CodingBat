package Logic1;

public class squirrelPlay {
	/*
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.


		squirrelPlay(70, false) → true
		squirrelPlay(95, false) → false
		squirrelPlay(95, true) → true
		
		https://codingbat.com/prob/p141061
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		  if((isSummer&&temp>59&&temp<101)||(temp>59&&temp<91)){
		    return true;
		  }
		  return false;
	}

}
