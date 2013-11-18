import java.io.*;
import java.lang.String;
import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Coin {

    //Instance Vars
    private String face;
    private int flips, heads, tails;
    private int percentHeads;

    //Methods

    public void reset(){
        flips = 0;
        heads = 0;
        tails = 0;
    }

    ///Get Methods

    public String getFace(){
        return face;
    }
}