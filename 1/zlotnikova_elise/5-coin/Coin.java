import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips,heads,tails;
    private double fairness; 

    public void reset() { 
	flips = 0; 
	heads = 0; 
	tails = 0; 
	fairness = 0.0;
    }
    
<<<<<<< HEAD
    public String getFace() { 
=======
    public void getFace() { 
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	return face;
    }

}
