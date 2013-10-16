
public class forLoop {
    public static void main (String [] args){
	forLoop f = new forLoop();
	System.out.println(f.GCD(12,8));
    }
    public int GCD(int a, int b){	
	int d;
	for (d = a>b?b:a;d>1;d--){
	    if (a%d==0 && b%d==0)
		return d;
	}
	return d;
    }
    
}