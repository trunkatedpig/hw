public class Diag{
    public String diag(int n){
	int counter;
	String ans = "";
      	for (counter = 0;counter < n;counter++){
	    int spaceCounter = 0;
	    while (spaceCounter < counter){
		ans = ans + " ";
		spaceCounter = spaceCounter + 1;
	    }
	    ans = ans + "*";
	    if (counter != n - 1){
		ans = ans + "\n";
	    }
	    spaceCounter = 0;
	}
	return ans;
    }

    public String diagWord(String s){
	int counter;
	String ans = "";
	for (counter=0;counter<s.length();counter++){
            int letterCounter;
	    for(letterCounter=0;letterCounter<counter;letterCounter++){
		ans = ans + " ";
	    }
	    ans = ans + s.substring(counter,counter+1);
            if (counter != s.length() - 1){
                ans = ans + "\n";
            }
	}
	return ans;
    }

    public String fence(int h,int w){
        String ans = "";
        int row;
        int column;
        for (row = 0;row < h;row++){
            if (row == 0 || row == h -1){ 
                for (column = 0;column < w; column++){
                    if (column == 0 || column == w - 1){
                        ans = ans + "+";
                    }else{
                        ans = ans + "-";
                    }
                }
            }else{
                for (column = 0;column < w;column++){
                    if (column == 0 || column == w - 1){
                        ans = ans + "|";
                    }else{
                        ans = ans + " ";
                    }
                }
            }
            if (row != h-1){
                ans = ans + "\n";
            }
        }
        return ans;
    }
}
