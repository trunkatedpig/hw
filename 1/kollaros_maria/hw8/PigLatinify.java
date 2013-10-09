public class PigLatinify{
	private String output;

   //worked with Coby Goldberg
   // code works under the impression that the first letter for n is lower case but it can be made for capital letters too
	public void Latin(String n){
		String x = n.substring(0,1);
		String y = n.substring(0,2);
		if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")){
			output = n.substring(1) + x + "yay";
		}
		else{
			if (y.equals("th") || y.equals("sh") || y.equals("ch")){
				output = n.substring(2) + y + "ay";
			}
			else{
			output = n.substring(1) + x + "ay";
			}	
		}
	}

	public String PigLatin(){
		return output;
	}
	
}
