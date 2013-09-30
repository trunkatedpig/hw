import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int numOfFlips;
    private int numOfTails;
    private int numOfHeads;
    private double fairness;

    public void resetCount(){
	numOfFlips=0;
	numOfTails=0;
	numOfHeads=0;
	fairness=0.0;
    }

    public String currentHead(){
	return face;
    }










}
