public class Diagonal{
    String result = "";
    String spaces = "";
    public String diag(int i){
	for (int x=0;x<i;x++){
	    result = result + spaces + "*\n";
	    spaces = spaces + " ";
	}
	return result;
    }
    public String diagWord(String s){
	int l = s.length();
	String result = "";
	String spaces = "";
	for (int x=0;x<l;x++){
	    result = result + spaces + s.substring(x,x+1) + "\n";
	    spaces = spaces + " ";
	}
	return result;
    }
    public String fence(int x, int y){
	result = "";
	for (int i = 0;i<y;i++){
	    for (int j = 0;j<x;j++){
		if (i==0 || i==y-1){
		    if (j==0 || j==x-1){
			result = result + "+";
		    }
		    else{
			result = result + "-";
		    }
		}
		else{
		    if (j==0 || j==x-1){
			result = result + "|";
		    }
		    else{
			result = result + " ";
		    }
		}
	    }
	    result = result + "\n";
	}
	return result;
    }

}
