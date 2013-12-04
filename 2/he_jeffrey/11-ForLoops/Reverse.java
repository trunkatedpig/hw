public class Reverse {
    private String resul = "";
    public String reverse(String a) {
	String result;
	for (int i = a.length() - 1; i >= 0; i--) {
	    System.out.println(i);
	    System.out.println(a.substring(i,i+1));
	    resul = resul + a.substring(i,i+1);
	}
	return resul;
    }
}