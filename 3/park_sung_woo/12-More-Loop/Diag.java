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

    public String diag(String s){
	int coutner;
	String ans = "";
	for (counter=0;counter<s.length();counter++){
	    for(letterCounter=0;letterCounter<counter;counter++){
		ans = ans + " ";
	    }
	    ans = ans + s.substring(counter);
	}
	return ans;
    }
}
