import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        Coin c1,c2;
        CoinPurse p;
        c1 = new Coin(25,"quarter");
        c2 = new Coin(10,"dime");
        p = new CoinPurse();

         System.out.println(c1.getName());
         System.out.println(c1.getValue());
         p.addTo(c1);
         p.removeFrom(c2);
        System.out.println(p.getAmount());      

    }
}
