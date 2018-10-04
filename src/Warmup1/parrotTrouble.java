
public class parrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		  if(talking && hour<7){
		    return true;
		  }
		  else if(talking && hour>20){
		    return true;
		  }
		  return false;
		}

}
