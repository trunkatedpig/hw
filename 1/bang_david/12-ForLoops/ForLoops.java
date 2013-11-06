
public class ForLoops {
    public String diag (int n) {
	String s = "";
	for (int i = 0 ; i < n; i ++) {
	    System.out.println ("*");
	    s = s + " ";
	    System.out.print (s);
	
	}
	System.out.println (" ");
	return  " ";
    }

    /* works as public void diag too if we get rid of the return statement, but the homework asked for public String diag so " " is returned as a place holder */

    public String diagWord (String w) {
	String s = "";
	for (int i = 0 ; i < w.length(); i ++) {
	    System.out.println (w.substring (i , i + 1));
	    s = s + " ";
	    System.out.print (s);
	}
	System.out.println (" ");
	return " ";
    }

    public String fence (int h, int w) {
	if ( h < 2 || w < 2) {
	    return "Parameters are less than 2 so fence cannot be made";
	}
	else {
	    String a = "";
	    String t = "";
	    String o = "";
	    int i, p, j;
	    for (i = 0;i < w; i ++) {
		if (i == 0 || i == w - 1) {
		    t = t + "+";
		}
		else {
		    t = t + "-";
		}
	    }
	    for (p = 0;p < w; p ++) {
		if (p == 0 || p == w - 1) {
		    a = a + "|";
		}
		else {
		    a = a + " ";
		}
	    }
	    for (j = 0;j < h; j ++) {
		if (j == 0 || j == h - 1) {
		    o = o + t + "\n";
		}
		else {
		    o = o + a + "\n";
		}
	    }
	    return o;
	}
    }
}
       
	    
