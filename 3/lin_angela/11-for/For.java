public class For {




public boolean isPrime(int n){
    int factor;
    boolean ans = true;
    if (n==1)
	ans = false;
    for (factor=n-1; factor>1; factor--){
	if (n%factor==0)
	    ans = false;
    }
    return ans;
}

    public String Reverse(String s){
	int index;
	String newString="";
	for (index=s.length()-1;index>=0;index--){
	    newString = newString + s.substring(index,index+1);
	}
	return newString;
    }

    public String table(int n, int m){
	int rows;
	int counter;
	int element;
	String returnString = "1 2 3 4 5 \n";
	for (rows=1; rows<=m; rows++){
	    counter = 1;
	    returnString = returnString + rows + " ";
	    while (counter<=n){
		returnString= returnString + counter*rows + " ";
		counter = counter +1;
	    }
	    returnString = returnString + "\n";
	}
	return returnString;
    }

}

