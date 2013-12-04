import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String [] args){
	Diag d=new Diag();
	System.out.println(d.diag(4));
	System.out.println(d.diagWord("Hello"));
	System.out.println(d.fence(5,6));
    }}