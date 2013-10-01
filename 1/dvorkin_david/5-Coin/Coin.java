import java.io.*;
import java.util.*;

public class Coin {

    private String side;

    private int total;

    public int heads;

    private int tails;

    private int fairness;

    public void reset(){
	total = 0;
	heads = 0;
	tails = 0;
	fairness = 0;}

    public String getSide() {
	return side;
    }

}
