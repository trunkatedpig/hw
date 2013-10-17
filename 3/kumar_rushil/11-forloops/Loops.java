public class Loops{

    public String reverse (String n){
	int x;
	String s = "";
	for (x = n.length(); x>0 ; x --){
	    s = s + n.substring(x-1);
	    n = n.substring(0,x-1);
	}
	return s;
    }

}
