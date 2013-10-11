import java.io.*;
import java.util.*;

public class fact{
    
    
    int Answer = 0;


    public int FactorialWhile(int number){
		
	while (number != 2) {
	    Answer = Answer + (number * (number - 1));
	    
	    /*
	    System.out.println(Answer);
	    System.out.println(number - 1);
	    System.out.println(number);
	    */
	    number = number - 1;
	    
	    
	
	}
	return Answer;}

    public void Factorial(int number){
	
	if( number == 0) {
	    Answer = Answer + (number * (number - 1));
	    Factorial(number - 1);
	}
	else {
	
	    getAnswer();
	}}
    
    
    public int getAnswer(){
	
	return Answer;
    }
}

	
	    

