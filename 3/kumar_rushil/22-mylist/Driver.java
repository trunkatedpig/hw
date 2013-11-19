import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){

        myList list = new myList(20, 20);
        System.out.println(list);
        System.out.println(list.remove(4));
        System.out.println(list);
        list.add(4,200);
        System.out.println(list);
    }
}
