import java.io.*;
import java.util.*;

public class Coin {
    private String face; 
    private int flips;
    private int Fairness;
    
    public Coin(){
	setflips(0);
	setFairness(50);
	//constrictors(a type of method) default if you give no parameters in driver, this will be the start///
    }
    public Coin(int n){
	setflips(0);
	setFairness(n);
    }
    ///define what set flips and fairness does methods
    public void setFlips(int n){
	flips = n; 
    }
    public void setFairness(int n){
	Fairness = n;
    }
    ///output 
    public String getHead(){
	return face;
    }
}
