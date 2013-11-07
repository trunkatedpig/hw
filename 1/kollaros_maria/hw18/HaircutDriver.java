import java.io.*;
import java.util.*;

public class HaircutDriver{
    public static void main (String[] args){
	Haircut Katniss = new Haircut();
	System.out.println(Katniss.RevFill(6));
	System.out.println(Katniss.MakeRandom(5,10,20));
    }
}
