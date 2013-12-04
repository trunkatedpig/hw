import java.io.*;
import java.util.*;

public class forLoopsNG{

    public String diag(int n){
	String asterix = "*";
	String answer = "";
	for (int i=0; i<n; i++){
	    for (int j=i; j>0; j--){
		answer = answer + " ";
	    }
	    answer = answer + asterix + "\n";
	}
	return answer;
    }

    public String diagword(String w){
	String answer = "";
	int a = w.length();
	for (int i= 0; i<a; i++){
	    for (int j=i; j>0; j--){
		answer = answer + " ";
	    }
	    answer = answer + w.substring(i, i+1) + "\n";
	}
	return answer;
    }

	public String fence(int h, int w){
	String answer= "";
	if (h < 2 || w < 2){
	    answer = answer + "Inputs must be larger than 1";
	}
	
	else {
	    for (int i = 0; i<=h; i++){
		
		// First Line
		if (i==1){
		    for (int j = 1; j<= w; j++){
			if (j==1){
			    answer = answer + "+";
			}
			else if(j==w){
				answer = answer + "+" + "\n";
			    }
			else {
			    answer = answer + "-";
			}
		    }
		}
		
		// Middle lines
		if (i>1 && i<h){
		    for (int k = 1; k<= w; k++){
			if (k==1){
			    answer = answer + "|";
			}
			else if (k==w){
				answer = answer + "|" + "\n";
			    }
			else {
			    answer = answer + " ";
			}
		    }
		}
		
		// Last Line
		if (i==h){
		    for (int m= 1; m<=w; m++){
			if (m==1 || m==w){
			    answer = answer + "+";
			}
			else {
			    answer = answer + "-";
			}
		    }
		}
	    }
	}
	return answer;
	}
}
