import java.io.*;
import java.util.*;

public class Coin{
    
    String Face;
    double random = Math.random();
    int value;
    String coinName;

    public Coin(int givenValue, String givenName){

	value = givenValue;
	    
	if (value == 1) {
	    coinName = "Penny";
	} else if (value == 5) {
	    coinName = "Nickel";
	} else if (value == 10) {
	    coinName = "Dime";
	} else if (value == 25) {
	    coinName = "Quarter";
	} else if (value == 0){
	    coinName = "About the amount of money Eric has";
	} else {
		    coinName = givenName;
	}}

		
	       

			
		    
    

    
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
    }}
	
   
