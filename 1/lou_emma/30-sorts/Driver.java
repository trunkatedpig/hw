import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
        Sort a = new Sort(10);
        Sort b = new Sort(10);
        Long astart = System.currentTimeMillis();
        a.sort();
        Long aend = System.currentTimeMillis();
        System.out.println("radix: " + (aend-astart));
        Long bstart = System.currentTimeMillis();
        b.Bubble();
        Long bend = System.currentTimeMillis();
        System.out.println("Bubble:" + (bend-bstart));
    }
}
