public class Diagonal{
    
    public String diag(int n){
	String space = "";
	for (int p = 0; p < n; p++) {
	    for (int q = 1; q <= p; q++) {
		space += " ";
	    }
	    space += "*\n";
	}
	return space;
    }

    public String diagWord(String s) {
	String space = "";
	for (int p = 0; p < s.length(); p++) {
	    for (int q = 1; q <= p; q++) {
		space += " ";
	    }
	    space += s.substring(p,p + 1) + "\n";
	}
	return space;
    }
    
    public String fence(int h,int w){
	String top = "+";
	String result = "";
	for (int p = 1; p < w-1; p++){
	    top += "-"; 
	}
	top += "+";
	result += top + "\n";
	for (int p = 1; p < h-1;p++){
	    result += "|";
	    for (int q = 1; q < w-1;q++){
		result += " ";
	    }
	    result += "|\n";
	}
    	result += top;
	return result;
    }

}
