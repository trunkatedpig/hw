public class HW14{
     
    public boolean sameStarChar(String str) {
	boolean t = true;   
	for (int s = 1; s < str.length();s++){
	    if (s > 1) {
		if (str.substring(s -1, s).equals("*") && ! str.substring(s,s + 1).equals(str.substring(s - 2,s  - 1)))
		    t = false; 
               
	    }

        }
        return t;
    }



    public String sameEnds(String string) {
        String s = "";
        int p = string.length();
        for (int t= 1;t < (string.length () + 2) / 2;t++){
            if (string.substring(0, t).equals(string.substring(p-t,p)))
                s= string.substring(0,t);
        }
        return s;
    }
}
