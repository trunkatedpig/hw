public class Forloops {
    public static void main(String [] args){
	for (int i=0;i < 10; i++){
	    System.out.println(i);
}
    
	String a = "rapsac redrum";
	String n = "";
	int b = a.length();
	for (b=b-1; b>-1; b=b-1){
	    n = n + a.substring(b,b+1);
	}
	System.out.println(n);
}
}