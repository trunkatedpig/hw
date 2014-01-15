import java.io.*; 
import java.util.*; 


public class Cipher{ 
    private double[] corpusFreqs = new double[25]; 
   

    public string encode(String s, int offset){ 
	String x = ""; 
	char c;
	s = s.toLowerCase(); 
	for (int i = 0; i < s.length(); i++){ 
	    c = charAt(i); 
	    if (c >= 'a' && c <= 'z')
		x = x + (char) (((c-'a'+offset)%26)+'a');
	}
	return x; 
    }

    public void buildCorpusFregs(String filename){
	try {
        Scanner sc = new Scanner (new File(filename));
        while (sc.hasNext()) {
            String s = sc.nextLine();
	    s.toLowerCase();
	    for (int i = 0; i<s.length();i++){
		char c = s. charAt(i); 
		int spot = 0; 
		if (c>='a' && c<='z'){
		    spot = (int) (c-('a'+1));
		    corpusFreqs[spot] += 1.0; 
		}
	    }
	    scan.close(); 
		    
		
          
           
            }
        } catch (Exception e) {} 
    }
	       
       
}
