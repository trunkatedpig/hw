import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String args[]) {
	Arraystuff a = new Arraystuff();
	int[] i1 = {13, 1, 2, 13, 2, 1, 13};
	int[] i2 = {9, 7, 2, 9, 2, 2, 6};
	System.out.println(Arrays.toString(a.RevFill(6)));
	System.out.println(Arrays.toString(a.MakeRandom(17,8,12)));
	System.out.println(a.sum13(i1));
	System.out.println(a.modThree(i2));
    }
}