import java.io.*;
import java.util.*;

public class PigLatin{

private CharSequence f;
private String rest;
private String vowels;
       
public String piglatinify(String word){
       f = word.substring(0,1);
       rest = word.substring(1);
       vowels = "aeoiu";

       if (vowels.contains(f)){
	       return word + "yay";
	   }
       
       else{
	   return rest + f + "yay";
	       }
}
}
