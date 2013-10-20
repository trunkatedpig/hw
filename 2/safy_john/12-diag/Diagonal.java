public class Diagonal {
    public String diag (int n) {
	String result = new String ();
        for (int l = 0; l != n; l ++) {
	    for (int s = 0; s != l; s ++) {
		result = result + " ";}
	    result = result + "*" + "\n";
	}
	return result;
    }
    
    public String diagWord (String w) {
	String result = new String ();
        for (int l = 0; l != w.length(); l ++) {
	    for (int s = 0; s != l; s ++) {
		result = result + " ";}
	    result = result + w.substring (l, l + 1) + "\n";
	}
	return result;
    }
    
    /* public String firstLast (int w) {
	String result = new String();
	result = "+"
        for (int l = 2; l != w; l ++) {
	    
	
    public String fence (int h, int w) {
	String result = new String();
	for (int l = 0; l != h; l ++) {
	    for (int s = 0; s != w; s ++)
    */
