import java.io.*;
import java.util.*;

public class DriverCoin{
    public static void main(String[] args){
	Coin sweyn = new Coin("Sean",0.001);
	System.out.println(sweyn.toss());
	sweyn.setRandProb();
	System.out.println(sweyn.toss());
    }
}
