import java.io.*;
import java.util.*;

public class Coin{
    
    String Face;
    double random = Math.random();
    
	public void Flip(){
	
	if (random > 0.5){
	    
	    Face = "Heads";
	    System.out.println(random);
	
	}
	
	else {
	    
	    Face = "Tails";
	    System.out.println(random);
	}}

    public String getFace(){

	return Face;
	
    }
	







}
