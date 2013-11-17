import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Arrays a;
	a = new Arrays();
        Arrays.toString(a.RevFill(9));
	System.out.println(Arrays.toString(a.RevFill(0)));
	System.out.println(Arrays.toString(a.MakeRandom(5, 2, 10)));
    }
}
