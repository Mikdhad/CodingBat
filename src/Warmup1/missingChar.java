
public class missingChar {
	public String missingChar(String str, int n) {
		  String[] Splat = str.split("");
		  String word = "";
		  Splat[n] = "";
		  for (int i=0; i<Splat.length;i++){
		    word = word + Splat[i];
		  }
		  return word;
		}
}
