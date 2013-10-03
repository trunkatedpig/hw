import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int flips,heads,tails,fairnessheads;

    public void reset(){
	flips=0;
	heads=0;
	tails=0;
	fairnessheads=0;
    } 

    public String currentFace(){
	return face;
    }

}
