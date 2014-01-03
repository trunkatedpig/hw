public class Cipher{
    public String encode(String s, int n){
	String u="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String l="abcdefghijklmnopqrstuvwxyz";
	for (int i=0;i<s.length();i++){
	    //Below will lowercase the string	
	    if (u.indexOf(s.substring(i,i+1))!=-1){
		String a="";
		int q=u.indexOf(s.substring(i,i+1));
		a=s.substring(0,i)+l.substring(q,q+1)+s.substring(i+1);
		s=a;}

	    //Below will encode the string
	    String a="";
	    if (l.indexOf(s.substring(i,i+1))!=-1){
		a=s.substring(0,i);
		int q=(l.indexOf(s.substring(i,i+1))+n)%26;
		a=a+l.substring(q,q+1)+s.substring(i+1);
		s=a;}
	}
	return s;
    }
}
