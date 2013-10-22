import java.util.*;
import java.io.*;

public class Practice {
    public String Reverse(String s){
	int len = s.length();
	String answer="";
	int i;
	for(i=0;i<len;i++){
	    int lensub = s.length();
	    answer=answer+s.substring(lensub-1);
	    s=s.substring(0,lensub-1);

}

	return answer;
    }


}