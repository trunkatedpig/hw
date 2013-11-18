import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        Coin c1;
        c1 = new Coin();

        System.out.println(c1.getFace());
        c1.reset();

        System.out.println(c1.getNum_flips());
    }
}
