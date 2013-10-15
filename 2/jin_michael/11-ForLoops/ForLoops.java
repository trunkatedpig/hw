public class ForLoops{
    public String reverse(String s){
	String answer="";
	for (int n=(s.length());n>1;n--){
	    answer=answer + s.substring(n-1,n);}
	return answer;
	}
    }

}