public class For {
    public int fact(int n){
	int x = 1;
	for (int i = n; i>0; i=i-1){
	    x = x*i;
	}
	return x;
    }

    public String reverse(String s){
	String r = "";
	for (int i = s.length(); i>0; i = i-1){
	    r = r + s.substring(i-1,i);
	}
	return r;
    }

    public String table(int n, int m){
	String s = "";
	//row uno
	for (int x=1;x <= n; x=x+1){
	    s = s +x+" ";
	}
	s = s + "\n";
	//makes the 1 2 3 4 5 etc.

	//rest of rows
	for (int t=1;t<=m;t=t+1){
	    s = s + t + " "; 
	    // creats first number
	    for (int y = 1; y<=n; y = y+1){
		s = s+(t*y) + " ";
		/*then goes through this for statement,
		  multiplying m and n..
after all the #s have been multiplied..
...goes on to a new line and starts on the second number*/
	    }
	    s = s + "\n";	    
	}
	return s;
    }

}

