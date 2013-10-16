public class For{

//part one
	public int gcd(int A, int B) {
	int smaller = B;
	if (B > A)
	    smaller = A;
	for (int i=smaller; (A % i != 0 || B % i != 0); i=i-1){ 
	    smaller=i;
	}
	return smaller-1;
	}
	
//part two
	public String reverse(String s){
		String reversed="";
		int len = s.length();
		for (int i=len; i>0; i=i-1){
			reversed=reversed + s.substring(i-1,i);
		}
		return reversed;
	}
	
//part three
	public String table(int n, int m){
		String complete=" ";
		for (int init=n; init>0; init = init - 1){
			complete=complete + init;
		}
		return "";
		
		
	}
}

