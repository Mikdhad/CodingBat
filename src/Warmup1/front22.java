
public class front22 {
	public String front22(String str) {
		  if(str.length()<=2){
		    return str+str+str;
		  }
		  else{
		    String two = str.substring(0,2);
		    return two + str + two;
		  }
		}
}
