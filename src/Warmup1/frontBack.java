
public class frontBack {
	public String frontBack(String str) {
		  if (str.length()==1){
		    return str;
		  }
		  else{
		    String[] Splat = str.split("");
		    String last = "";
		    String word = "";
		    last = Splat[Splat.length-1];
		    Splat[Splat.length-1] = Splat[0];
		    Splat[0] = last;
		    for(int i = 0; i<Splat.length;i++){
		      word = word + Splat[i];
		    }
		    return word;
		  }
		}
}
