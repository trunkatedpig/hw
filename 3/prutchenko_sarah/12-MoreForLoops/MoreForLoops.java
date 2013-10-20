public class MoreForLoops{
    public String diag(int n){
	String ans = "";
	for (int starpos = 0; starpos  < n; starpos  ++){
	    if (starpos == 0){
		ans = ans + "*";
	    }
	    else{
		for (int spaces = 1; spaces < starpos+1; spaces ++){
		    ans = ans + " ";
		}
		ans = ans + "*";
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
}
	    
