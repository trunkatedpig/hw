import java.util.*;
import java.io.*;

public class Driver {

    public static void main (String[] args) {

        array a = new array();

        System.out.println("List X: ");

        int[] o = a.MakeRandom(10, 8, 40);

        System.out.println("List Y: ");

        int[] m = a.MakeRandom(15, 0, 30);

        System.out.println("List Z: ");

        int[] n = a.MakeRandom(32, 5, 75);

        System.out.println("-------");
        System.out.println("-------");
        System.out.println("-------");

        System.out.println(a.modThree(o));
        System.out.println(a.modThree(m));
        System.out.println(a.modThree(n));

    }
}
