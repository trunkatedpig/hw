
public class forLoop {
    public static void main (String [] args){
	forLoop f = new forLoop();
	System.out.println(f.GCD(12,8));
	System.out.println(f.stringreverse("hello"));
	System.out.println(f.table(5,3));
    }
    public int GCD(int a, int b){	
	int d;
	for (d = a>b?b:a;d>1;d--){
	    if (a%d==0 && b%d==0)
		return d;
	}
	return d;
    }
    public String stringreverse(String s){
	String result = "";
	int i;
	for (i=0;i<s.length();i++){
	    result = s.substring(i,i+1) + result;
	}
	return result;
    }

    public String table(int n, int m){
	String result = "";
	int k;
	for (k=1;k<=n;k++){
	    result = result+k;
	}
	result = result+"/n";
	int i;
	int j;
	for (i=1;i<=m;i++){
	    result=result+i;
	    for (j=1;j<=n;j++){
		result=result+(i*j);
	    }
	    result = result+"/n";
	}
	return result;
    }
}
