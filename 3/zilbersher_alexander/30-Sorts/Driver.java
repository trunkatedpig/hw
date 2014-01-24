import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Sort s = new Sort();
	//Bubble
	System.out.println("Bubble: Array requiring many swaps");
        double[] a = {9,8,7,5,12,5,3,3,3457,1,423,5};
	double[] b = s.bubble(a);
	s.ArrayToString(b);
	System.out.println("Bubble: Array requiring few swaps");
	double[] a2 = {1,2,3,4,5,7,6,8,9,11,12,43};
	double[] b2 = s.bubble(a2);
	s.ArrayToString(b2);
	/*System.out.println("Bubble: Array requiring tons of swaps");
	  double[] a3 = {5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27};
	  double[] b3 = s.bubble(a3);
	  s.ArrayToString(b3);
	*/
	//Selection
	System.out.println("Selection: Array requiring many swaps");
        double[] a4 = {9,8,7,5,12,5,3,3,3457,1,423,5};
	double[] b4 = s.Selection(a4);
	s.ArrayToString(b4);
	System.out.println("Selection: Array requiring few swaps");
	double[] a5 = {1,2,3,4,5,7,6,8,9,11,12,43};
	double[] b5 = s.Selection(a5);
	s.ArrayToString(b5);
	/*
	  System.out.println("Selection: Array requiring tons of swaps");
	  double[] a6 = {5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27,5,345,654,234,7435,2345,34752,346,25,734,573,446,2346,234,623,732,46,237,34,62,34723,412,63,4723,7,2346,346,27,24,15,1,462,7,27};
	  double[] b6 = s.Selection(a6);
	  s.ArrayToString(b6);
	*/
	//Insertion
	System.out.println("Insertion: Array requiring many swaps");
        double[] a7 = {9,8,7,5,12,5,3,3,3457,1,423,5};
	double[] b7 = s.Selection(a7);
	s.ArrayToString(b7);
	System.out.println("Insertion: Array requiring few swaps");
	double[] a8 = {1,2,3,4,5,7,6,8,9,11,12,43};
	double[] b8 = s.Selection(a8);
	s.ArrayToString(b8);
    }
}
