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
    }
}
