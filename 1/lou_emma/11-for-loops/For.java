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
	    for (int init=1; init<=n; init = init + 1){
			complete=complete + init + " ";
		  
	    }
	    for (int ial=1; ial<=m; ial = ial + 1){
			complete = complete + "\n" + ial;
			for (int i = 1; i <= n; i = i + 1){
		  		complete=complete + (ial * i) + " "; 
			}
	    }
	    return complete;
		
		
	}
}

