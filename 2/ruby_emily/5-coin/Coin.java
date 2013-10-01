import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int h,t,f
    private double p;
	/*where h=heads, t=tails, f=flips, and p=percent heads*/

    public void resetCount(){
	h=0;
	f=0;
	t=0;
	p=0;
    }
    public void getFace(){
	return face;
    }

}
