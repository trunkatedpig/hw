import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
    Sorts s = new Sorts();
    s.randomints();
    s.bsort(s.getnums());
    System.out.println(s.getNums());
    System.out.println(s.getBuckets());
    }
}
