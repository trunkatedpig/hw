public class Reverse{
    public boolean isPrime(int a){
	for (int result=a/2;result>1;result--){
	    if (a % result == 0){
		return false;
	    }
	}
	return true;
    }
    public String reverse(String s){
	String result = "";
	for (int l=s.length();l>=0;l--){
	    if (l == s.length()){
		result += s.substring(l);
	    }
	    else{
		result += s.substring(l,l+1);
	    }
	}
	return result;
    }
    public String table(int n, int m){
	//odd table
	String result="";
	for (int i = 1 ;i<=n;i++){
	    result = result + i;
	    if (i!=n){
		result = result + " ";
	    }
	    else{
		result = result + "\n";
	    }
	}
       	for (int j = 1;j<=m;j++){
	    result = result + j + " ";
	    for (int k = 1;k<=n;k++){
		result = result + (k*j);
		if (k!=n){
		    result = result + " ";
		}
		else{
		    result = result + "\n";
		}
	    }
	}
	return result;
    }
}
