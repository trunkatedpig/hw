public class For {
    public String reverse(String s){
	int x;
	String result = "";
	for (x = s.length()-1; x >= 0; x--){
	    result = result + s.substring(x,x+1);
	}
	return result;
    }

    public String table(int m, int n){
	String result = "";
	int b;
	int a;
	for (b=1; b<=n; b++){
	    for (a=1; a<=m; a++){
		result = result + (a * b) + " ";
	    }
	    result = result + "\n";
	}
	return result;
    }
}
