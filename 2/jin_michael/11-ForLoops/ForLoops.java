public class ForLoops{

    public int gcd(int a, int b){
	for (int n=Math.min(a,b);n>1;n--){
	    if (a%n==0 && b%n==0){
		return n;}
	}
	return 1;
    }

    public String reverse(String s){
	String answer="";
	for (int n=s.length();n>0;n--){
	    answer=answer + s.substring(n-1,n);}
	return answer;
	}

    public String table(int n, int m){
	String answer="1";
	for (int r=2;r<n+1;r++){
	    answer= answer +" "+r;}
	answer=answer+"\n";
	for (int r=1;r<m+1;r++){
	    answer=answer+r;
	    for (int w=1;w<n+1;w++){
		answer=answer+" "+(w*r);}
	    answer=answer+"\n";
	}
	return answer;
    }
}
