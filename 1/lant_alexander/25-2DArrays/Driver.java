
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) {
	
	WordSearch w = new WordSearch(20,40);
	Random R = new Random();
	w.RandWords(60);
	//System.out.println(w);
	w.FillIn();
       	System.out.println(w);	
	System.out.println("WORDS:");
	for (int i = 0; i < w.length; i++){
	    if (i != 0 && i%6 == 0) System.out.println("");
	    System.out.print(w.usedWords.get(i) + " ");
    	}
	System.out.println("\n");
    }
}
