
public class backAround {
	public String backAround(String str) {
		  if(str.length()==1){
		      return str+str+str;
		  }
		  else{
		    char last=str.charAt(str.length()-1);
		    return last+str+last;
		  }
		}
}
