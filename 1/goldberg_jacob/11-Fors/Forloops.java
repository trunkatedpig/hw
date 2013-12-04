public class Forloops {
    // factorial as a for loop procedure
    public int factorial(int i){
	int outter = 1;
	for (; i > 0; i = i - 1){
	    outter = outter * i;
	}
	return outter;
    }

    public String Reverse(String s){
	String b = "";
	for (int i = s.length(); i >0; i = i - 1){
	    b = b + s.substring(i-1, i);
	}
	return b;
    }

    public String table(int n, int m) {
	String r="  ";
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
