public class For {
    
    public int GCD (int a, int b) {
	int x; 
	for (i = b; a%i != 0; i = i - 1) {
	    x = i; 
	}
	return x; 
    }

    public String Reverse (String s) {
	int i; 
	String x;
	for (i = s.length(); i >= 0; i = i - 1) {
	    x = x + s.substriing (i);
	}
	return x;
    }

    public String table (int n, int m) {
	String i = "";
	for (b = n; b > 1; b = b - 1) {
	    i = b + i;
	}
	i = "/n" + i; 
	for (a = 1; a > m; a = a + 1) {
	    i = a + i
	    for (b = n; b > 1; b = b - 1) {
		i = (b*a) + i;
	    }
	    i = "/n" + i;
	}
 
    }

}
