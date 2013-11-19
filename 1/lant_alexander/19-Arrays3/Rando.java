import java.util.*;
import java.io.*;
//import java.math.*;

public class Rando{
    public static void main(String[] args){

        Random r = new Random();
        
        for (int i = 0; i < 50; i++){
        System.out.print(r.nextInt(100)+ ", ");
        }

    }

}
