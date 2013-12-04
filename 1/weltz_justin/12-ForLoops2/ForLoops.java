public class ForLoops{
    public String multiplystring(String x, int y){
	String answer = "";
	for(int i = y; i > 0; i--){
	    answer = answer + x;
	}
	return answer;
    }
    public String diagonal(int x){
	String answer = "";
	for (int i = 0; x > i; i++){
	    answer = answer +  multiplystring(" ", i);
	    answer = answer + "*\n";
	}
	return answer;
    }
    public String diagonalword(String s){
	int length = s.length()-1;
	String answer = "";
	for (int i = 0; length >= i; i++){
	    answer = answer + multiplystring(" ", i);
	    answer = answer + s.substring(i, i + 1) + "\n";
	}
	return answer;
    }
    public String fence( int h, int w){
	if ( w < 3 || h < 3)  
	    return "these dimensions cannot be used";
	String answer = "";
	answer = answer + "*"+ multiplystring("-", w - 2) + "*\n";
	for(int i = h - 2; i > 0; i--){
	    answer = answer + "|" + multiplystring(" ", w - 2) + "|\n";
	}
	answer = answer + "*"+ multiplystring("-", w - 2) + "*\n";
	return answer;
    }
	
}
	
 
