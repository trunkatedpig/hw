public class counts{
    public static void main(String[] args){
	counts c = new counts();
	System.out.println(c.diag(5));
	System.out.println(c.diagWord("hello"));
	System.out.println(c.fence(5,8));
    }
    public String multiply(int n,String s){
	String result = "";
	for (int i=0;i<n;i++){
	    result = result + s;
	}
	return result;
    }
    public String diag(int n){
	String result = "";
	for (int i=0;i<n;i++){
	    result = result + multiply(i," ") + "*" + "\n";
	}
	return result;
    }
     public String diagWord(String s){
	String result = "";
	int n = s.length();
	for (int i=0;i<n;i++){
	    result = result + multiply(i, " ") + s.charAt(i) + "\n";
	}
	return result;
    }
    public String fence(int l,int h){
	String result = "";
	for (int i=0;i<h;i++){
	    if (i==0||i==h-1){
		result = result + "+" + multiply(l-2,"-") + "+" + "\n";
	    }
	    else{
		result = result + "|" + multiply(1-2," ") + "|" + "\n";
	    }
	}
	return result;
    }
}
