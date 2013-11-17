<<<<<<< HEAD
=======
/*
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private static int flips,heads;
    private static int fairness;

    public void reset(){
	flips = 0;
	heads = 0;
	fairness = 0;
    }

    public String getFace(){
	return face;
<<<<<<< HEAD
    }
}
=======

    }
    
}
*/
public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize

    public void initCoin(String f, Double p) {
face = f;
tosses=0;
heads=0;
prob=p;
    }


    public Coin() {
initCoin("Heads",0.5);
    }


    public Coin(String f) {
initCoin(f,0.5);
    }

    public String getFace() {
return face;
    }

    public boolean sameFace(Coin other) {
// complete this method
return false ; // placeholder

    }

    public void flip(String face){
   Random r = Random
       if }
    
}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
