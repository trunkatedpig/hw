import java.io.*;
import java.util.*;

public class Coin {

<<<<<<< HEAD
    private String side;
=======


    private Random prob = new Random();
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    private int total;

    public int heads;

<<<<<<< HEAD
=======
    private int percent = 50;

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    private int tails;

    private int fairness;

<<<<<<< HEAD
    public void reset(){
	total = 0;
	heads = 0;
	tails = 0;
	fairness = 0;}

    public String getSide() {
	return side;
    }

}
=======
    private String side;



    public void reset(){
        total = 0;
        heads = 0;
        tails = 0;
        fairness = 0;
    }

    public String flip(){
        if (prob.nextInt(100) < percent) {
            side = "Heads";
            heads+=1;
        }
        else
            {
                side = "Tails";
                tails+=1;
            }
        return side;

    }


    public String getSide(){
        return side;
    }
}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
