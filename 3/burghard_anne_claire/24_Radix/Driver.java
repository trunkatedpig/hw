import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
    Buckets b = new Buckets();
    b.sort();
    System.out.println(b.getBuckets());
    }
}
