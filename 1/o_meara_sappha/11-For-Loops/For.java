act function writen as a while loop:
    public int fact(int n) {
	int ans = 1;
	for (int x = n ; x > 0; x = x - 1) {
	    ans = ans * x;
	}
	return ans;
    }
    
    //2.
    public String StringReverse(String s) {
	String ans = "";
	for (int place = s.length() - 1 ; place > -1; place = place - 1) {
	    ans = ans + s.substring(place, place + 1);
	}
	return ans;
    }

    //3.
    public String table(int m, int n) {
	String ans = "";
	for (int a = 0; a <= m; a = a + 1) {
	    for (int b = 0; b <= n; b = b + 1) {
		if (a == 0 && b != 0) {
		    ans = ans + " " + b;
		}
		else if (a != 0 && b == 0) {
		    ans = ans + "\n" + a;
		}
		else if (a != 0 && b != 0) {
		    ans = ans + " " + a * b;
		}
	    }
	}
	return ans;
    }

}
