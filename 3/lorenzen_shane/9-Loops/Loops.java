public class Loops{
    
    public int fact(int n){
	if (n < 1)
	    return 1;
	else 
	    {
		return n*fact(n-1);
	    }
	     
    }
    
    public int fact2(int n){
	int ans;
	ans = 1;
	while (n>1){
	    ans = n*ans;
	    n = n-1;
	}
	return ans;
    }

}