import java.io.*;
import java.util.*;

public class Coin {

    private String face;
	private int flipNumber;
	private int headNumber;
	private int tailNumber;
	private int headChance;

	public void resetCount() {

	flipNumber = 0;
	    headNumber = 0;
	    tailNumber = 0;
	    headChance = 0;

	    }

    public String getFace () {
	return face;

	    }

    /* Setting values to test resetCount */
    
    public void setCount() {
	flipNumber = 5;
	    headNumber = 10;
	tailNumber = 12;
	    headChance = 13;
    }

    /*testing to see values */
    public int  getFlipNumber () {
	return flipNumber;

	    }

 public int getHeadNumber () {
	return headNumber;

	    }


 public int getTailNumber () {
	return tailNumber;

	    }

 public int getHeadChance () {
	return headChance;

	    }

}
