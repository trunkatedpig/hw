public class Moreloops{

    public String Diagonal(int x){

	String fin = "";
	String spaces = "";
	for (int n = 1; n == x; n ++){
	    spaces = spaces + " ";
	    fin = fin + "/r"  + spaces + "*";
	}
	return fin;
    }
    
}
