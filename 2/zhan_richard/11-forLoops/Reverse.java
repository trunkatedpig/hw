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
	result = "";
	for (int l=s.length();l>=0;l--){
	    result += s.substring(l,l+1);
}
