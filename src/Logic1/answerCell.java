package Logic1;

public class answerCell {
	/*
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.


		answerCell(false, false, false) → true
		answerCell(false, false, true) → false
		answerCell(true, false, false) → false
		
		https://codingbat.com/prob/p110973
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
	    if(isAsleep) {
	      return false;  
	    }
	    else if(isMorning && !isMom ) {
	      return false;
	    }
	  return true;
	}
}
