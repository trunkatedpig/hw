public class Loops{

    public String diag (int n){
	String result = "*";
	String spaces = " ";
	int x,y;
	String nl = "\n";
	for (x = 1; x < n; x ++){
	    result = result + nl;
	    spaces = "";
	    for (y = 0; y < x; y ++){
		spaces = spaces + " ";
	    }
	    result = result + spaces + "*";
	}
	return result;
    }
}
