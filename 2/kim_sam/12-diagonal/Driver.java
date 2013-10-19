import java.io.*;
import java.util.*;


public class Driver {
    public static void main (String[] args) {
	diagonal d = new diagonal();

	System.out.println(d.diag(5));
	System.out.println(d.diagWord("Supercalifragilisticexpialadocious"));
	System.out.println(d.fence(10,8));
    }
}
