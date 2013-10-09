public class PigLatinify{
	private String name;
	private String output;

	public PigLatinify(String name){
		name = name;
	}

	public void Latin(String n){
		String x = n.substring(0,1);
		String y = n.substring(0,2);
		if  ((x.equals("a")) or (x.equals("e")) or (x.equals("i")) or (x.equals("o")) or (x.equals("u"))){
			output = n.substring(1) + x + "yay";
		}
		else{
			if ((y.equals("th")) or (y.equals("sh")) or (y.equals("ch"))){
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
