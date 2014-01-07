import java.io.*;
import java.util.*;
public class Pilot extends Player {
    public int[] a1;
    public int[] a2;
    public int[] a3;
    public int[] a4;
    public Pilot(){
	a1 = new int[2];
	a2 = new int[2];
	a3 = new int[2];
	a4 = new int[2];
    }
    public int getXcor(int[] a){
	return a[0];
    }
}
