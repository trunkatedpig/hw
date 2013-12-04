public class For {

    public String diag(int n){
	String answer = "";
	for (int countx = 0; countx < n; countx++){
	    for (int county=0; county < countx; county++){
		answer = answer + " ";
	    }
	    answer = answer + "*\n";
	}
	return answer;
    }
    
    public String diagWord(String w){
	int counter;
	String ans = "";
	for (counter = 0; counter <= w.length(); counter++){
	    for (int i = 0; i < counter; i++){
		ans = ans + " ";
	    }
	    ans = ans + w.substring(counter, counter +1) + "\n";
	}
	return ans;
    }

    public String fence(int h, int w){
	String ans = "";
	String topbottom = "";
	String sides = "";
	int counterH, counterW;
	for (counterH = 1; counterH <= h; counterH++){
	    if (counterH == 1 || counterH == h){
		topbottom = topbottom + "+";
	    }
	    else {
		topbottom = topbottom + "-";
	    }
	}
	topbottom = topbottom + "\n";
	for (counterH = 1; counterH <= h; counterH++){
	    if (counterH == 1 || counterH == h){
		sides = sides + "|";
	    }
	    else {
		sides = sides + " ";
	    }
	}

	sides = sides + "\n";
	for (counterW = 1; counterW <= w; counterW++){
	    if (counterW == 1 || counterW == w){
		ans = ans + topbottom;
	    }
	    else {
		ans = ans + topbottom;
	    }
	}
	return ans;
    }
}

