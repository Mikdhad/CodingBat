
public class intMax {
	/*
	 * Given three int values, a b c, return the largest.


		intMax(1, 2, 3) → 3
		intMax(1, 3, 2) → 3
		intMax(3, 2, 1) → 3
		
		https://codingbat.com/prob/p101887
	 */
	
	public int intMax(int a, int b, int c) {
		  if(a>b && a>c){
		    return a;
		  }
		  if(b>a&&b>c){
		    return b;
		  }
		  return c;
		}

}
