
public class notString {
	public String notString(String str) {
		  String[] splat = str.split(" ");
		  if (splat[0].equals("not")){
		    return str;
		  }
		  else{
		    return "not " + str;
		  }
		}
}
