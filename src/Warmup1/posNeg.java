
public class posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		  if (negative){
		    if(a<0 && b<0){
		      return true;
		    }
		    return false;
		  }
		  if(a>0 && b<0){
		    return true;
		  }
		  else if (a<0 && b>0){
		    return true;
		  }
		  return false;
		}
}
