public class MoreFor {
    public String diag(int n) {
	String r="";
	String pad="";
	for (int i=0; i<n; i++) {
	    r=r+pad+"*\n";
	    pad=pad+" ";
	}
	return r;
    }
    public String diagword(String s) {
	String r="";
	String pad="";
	for (int i=0; i<s.length(); i++) {
	    r=r+pad+s.substring(i,i+1)+"\n";
	    pad=pad+" ";
	}
	return r;
    }
    public String multiply(String s, int n) {
	String r="";
	for (int i=0; i<n; i++) {
	    r=r+s;
	}
	return r;
    }
    public String fence(int i, int j) {
	String edgerow="+"+multiply("-",j-2)+"+\n";
	String midrow="|"+multiply(" ",j-2)+"|\n";
	return edgerow + multiply(midrow,i-2) + edgerow;
    }
}
