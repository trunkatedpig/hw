import java.io.*; 
import java.utl.*; 

public class For2 {
    
    public String diag(int n){
        String b= "";
        for (int i=1; i<=n; i = i + 1){
            String a = "";
            for (int u=i-1; u>0; u-=1){
                a += " ";
            }
            b+= a + "*" + "\n";
        }
        return b
	    }
    public String diagWord(String w){
        String b= "";
        for (int i=0; i<w.length(); i=i+1){
            String a = "";
            for (int n=i ; n>0; n= n-1){
                a += " ";
            }
            b+= a + w.substring(i,i+1) + "\n";
        }
        return b
	    }
    public String fence(int h, int w){
        if (h<2 || w<2){
            return "Doesn't fit requirements";
        }
        else {
            String b="";
            for (int i=0; i<h; i = i + 1){
                String in ="";
                for (int x=w-2; x>0; x= x-1){
                    if (i==0 || i==h-1){
                        in += "-";
                    }
                    else {
                        in += " " ;
                    }}
                if (i==0 || i==h-1){
                    b+= "+" + in + "+\n";
                }
                else {
                    b+= "|" + in + "|\n";
                }
            }
            return b
		}
    }
}
