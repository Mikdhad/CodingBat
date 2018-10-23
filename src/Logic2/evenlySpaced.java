package Logic2;

public class evenlySpaced {
	/*
	 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


		evenlySpaced(2, 4, 6) → true
		evenlySpaced(4, 6, 2) → true
		evenlySpaced(4, 6, 3) → false
		
		https://codingbat.com/prob/p198700
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		  if((a>b&&a<c)||(a>c&&a<b)){
		    return Math.abs(a-b)==Math.abs(a-c);
		  }
		  if((b>a&&b<c)||(b>c&&b<a)){
		    return Math.abs(a-b)==Math.abs(b-c);
		  }
		  if((c>a&&c<b)||(c>b&&c<a)){
		    return Math.abs(c-a)==Math.abs(b-c);
		  }
		  return a==b&&b==c?true:false;
	}
}
