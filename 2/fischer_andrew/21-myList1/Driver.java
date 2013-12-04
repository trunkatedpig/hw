//Andrew Fischer period 2 w/ Sam Kim


import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);

        for (int i = 0; i < 5; i++) {
            L.add((i + 1) * 10);
        }
        System.out.println(L);

        for (int i = 0; i < 7; i++) {
            L.add((i + 1) * 10);
        }
        
        System.out.println(L);
        

    }        


}
