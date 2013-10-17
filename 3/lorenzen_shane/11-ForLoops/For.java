public class For {
    public String Reverse(String s){
	int i;
	for (i=0; i <= s.length();i=i+1){
	    s= s.substring(1)+s.substring(0,1);
	}
	return s;
    }
}