public class Loops{

    public int fact(int n){
	if (n <= 1){
	    return n;
	}
	else{
	    return (n * (fact(n-1)));
	}
    }

    public int fact2(int n){
	if (n <= 1){
	    return n;
	}
	int ans = n;
	while (n > 1){
	    n = n-1;
	    ans = ans * n;
	}
	return ans;
    }
}