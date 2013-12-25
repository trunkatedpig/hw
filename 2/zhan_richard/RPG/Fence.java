import java.io.*;
import java.util.*;

public class Fence{
    private String result;
    public String multiFence(int xcor, int ycor, int x, int y, String[] text){
	result ="";
	for (int i = 0; i <= (x+((xcor-1)*(x-1)))*(y+((ycor-1)*(y-1)));i++){
	    if (i==0  ||  i==(x+((xcor-1)*(x-1)))  ||  i==(x+((xcor-1)*(x-1)))*(y+((ycor-1)*(y-1)))  )
		result = result + "+";
	    else
		result = result + "-";
	    if (i%(x+(xcor-1)*(x-1))==(x+(xcor-1)*(x-1))-1)
		result=result+"\n";
	}
	return result;
    }
    public String singleFence(int x, int y,String text){
        result = "";
        for (int i = 0;i<y;i++){
            for (int j = 0;j<x;j++){
                if (i==0 || i==y-1){
                    if (j==0 || j==x-1){
                        result = result + "+";
                    }
                    else{
                        result = result + "-";
                    }
                }
                else{
                    if (j==0 || j==x-1){
                        result = result + "|";
                    }
                    else{
                        result = result + " ";
                    }
                }
		if (j == 1 && i == (y/2)){
		    result = result + text;
		    j=j + text.length();
		}
            }
            result = result + "\n";
        }
	return result;
    }

}    
    
