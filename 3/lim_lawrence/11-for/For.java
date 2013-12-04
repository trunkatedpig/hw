public class For {
    public int fact(int n) {
	int r=1;
	for (int i=n; i>0; i--) {
	    r=r*i;
	}
	return r;
    }
    public String reverse(String s) {
	String r="";
	for (int i=s.length(); i>0; i--) {
	    r=r+s.substring(i-1,i);
	}
	return r;
    }
    public String table(int n, int m) {
	String r="  ";
	
	//first row
	for (int j=1; j<=n; j++) {
	    r=r+j+" ";
	}   
	r=r+"\n";
	
	//all the other rows
	for (int i=1; i<=m; i++) {
	    r=r+i+" ";
	    for (int j=1; j<=n; j++) {
		r=r+(i*j)+" ";
	    }
	    r=r+"\n";
	}

	return r;
    }
}
