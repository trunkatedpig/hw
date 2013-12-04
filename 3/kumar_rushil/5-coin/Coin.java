<<<<<<< HEAD
=======
import java.util.*;
import java.io.*; 
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
public class Coin {

    private String face;
    private int flips, heads, tails;
<<<<<<< HEAD
    private double percenthead;

    public void setFacehead(){
	face = "Head";
=======
    private double percenthead = 0.5;
    Random r = new Random();
    public void setFace(){
	if ((r.nextDouble()) <= percenthead)
	    face = "Head";
	else
            face = "Tails";
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public void addCount(){
	flips = flips + 1;
    }

    public void resetCount(){
	flips = 0;
<<<<<<< HEAD
=======
	heads = 0;
	tails = 0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }
}
