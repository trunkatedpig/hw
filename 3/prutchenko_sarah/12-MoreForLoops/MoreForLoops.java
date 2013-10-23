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
    public String diagWord(String v){
	String ans= "";
	for (int spaces = 0; spaces < v.length(); spaces ++){
	    if (v == ""){
		return "Please put in a word";
	    }
	    else{
		for (int letter = 0; letter<= spaces; letter ++){
		    if (letter == spaces){
			ans = ans + v.substring(letter, letter+1);
		    }
		    else{
			ans = ans + " ";
		    }
		}
	    }
	    ans = ans +"\n";
	}
	return ans;
    }
    public String fence(int h, int w){
	String ans = "";
        ans = ans + line1(w);
	ans = ans +line2(h, w);
	ans = ans + line1(w);
	return ans;
    }
    public String line1(int l){
	String ans = "+";
	for (int i = 0; i<l; i++){
	    ans = ans + "-";
	}
	ans = ans + "+ \n";
	return ans;
    }
    public String line2(int j, int k){
	String ans="";
	for (int m = 0; m < j; m++){
	    for(int n = 0; n< k; n++){
		if(n == 0 || n== k-1){
		    ans = ans + "|";
		}
		else{
		    ans = ans + " ";
		}
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
	
	
	
}
	    
