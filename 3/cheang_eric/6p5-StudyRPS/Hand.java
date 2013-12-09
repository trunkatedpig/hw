import java.io.*;
import java.util.*;

public class Hand{

    
    String Choice;
    
    
    double random = Math.random();

    
    public Hand(){
	
    }
    
    public String getChoice(){
	
	return Choice;

    }


    public void Shoot(){
	
	if (random < 0.3){
	    
	    Choice = "Rock";
	}

	else {
	    
	    if (random < 0.6 && random > 0.3){
		
		Choice = "Paper";
		
	    }

	    else {
		
		Choice = "Scissors";   
	    }	    }}

























}

    
   


