import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int hcount;
    private int tcount;
    private int fairness;

    public void perctHead(){
	fairness = hcount / (hcount + tcount);
    }
  
    public void reset(){
	hcount = 0;
	tcount = 0;
	fairness = 0;
    }
    public String getFace(){
	return face;
    }
}
