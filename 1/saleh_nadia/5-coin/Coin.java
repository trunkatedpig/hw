import java.io.*;
import java.util.*;

public class Coin {
<<<<<<< HEAD
    private String face; //will be "heads" or "tails"
=======
    private String face;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    private int flips, heads, tails;
    private int fairness;

    public void resetCounts () {
	flips = 0;
	heads = 0;
	tails = 0;
    }
    
    public String  getFace () {
	return face;
    }
}
