public class Loops{
    public int fact(int n){
	if (n<=1){
	    return n;}
	else {return n*fact(n-1);}
    }

    public int fact2(int n){
	int count=n-1;
	int answer=n;
	    while (count>0){
	    answer=answer*count;
	    count=count-1;
	    }
	return answer;
    }

}
