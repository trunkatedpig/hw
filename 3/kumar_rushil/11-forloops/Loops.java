public class Loops{

    public String reverse (String n){
	int x;
	String s = "";
	for (x = n.length(); x>0 ; x --){
	    s = s + n.substring(x-1);
	    n = n.substring(0,x-1);
	}
	return s;
    }

    public String firstrow (int n){
	int x;
	String s = "";
	for (x = 1; x < n + 1; x ++){
	    s = s + "" + x + " ";
	}
	return s;
    }
    public String table (int n, int m){
	int x;
	int y;
	String firstrow = firstrow(n);
	String s = firstrow;
	String s2 = "";
	String nl = "\n";

	for (x = 1; x < m + 1; x ++){
	    s = s + nl + x + " ";
	    s2 = "";
	    for (y = 1; y < n + 1; y ++){
		s2 = s2 + (y*x) + " ";
	    }
	    s = s + s2;
	}
	return s;
    }
}
