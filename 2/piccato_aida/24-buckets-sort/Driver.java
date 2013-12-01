import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	BucketsSort bs = new BucketsSort();
	System.out.println(bs);
	bs.sort();
	System.out.println(bs);
    }
}