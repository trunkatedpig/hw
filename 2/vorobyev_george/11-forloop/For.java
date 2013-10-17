
public class For {
    public static void main (String [] args){

	System.out.println(GCD(12,8));
	System.out.println(reverse("hello"));
	System.out.println(table(5,3));
    }
    public static int GCD(int a, int b){	
	int d;
	for (d = a>b?b:a;d>1;d--){
	    if (a%d==0 && b%d==0)
		return d;
	}
	return d;
    }
    public static String reverse(String s){
	String result = "";
	int i;
	for (i=0;i<s.length();i++){
	    result = s.substring(i,i+1) + result;
	}
	return result;
    }

    public static String table(int w, int h){
	String result = "";
	for (int i = 1; i <= w; i++){
	    result += i;
	    result += " ";
	}
	result = result + "/n";
	for (int i = 1; i <= w; i++){
	    result += i;
	    result += " ";
	    for (int j = 1; j <= h; j++){
		result += (i * j);
		result += " ";
	    }
	    result += "/n";
	}
	return result;
    }
}
