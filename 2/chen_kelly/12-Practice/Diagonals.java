import java.io.*;
import java.util.*;

public class Diagonals{
    private int spaces;
    private int rows;

    public String diag(int n){
	String s = "";
	for (rows = 1; rows <= n; rows ++){
	    for (spaces = 0;spaces < rows; spaces++){
		s = s + (" ");
	    }
	    s = s + "*"+ "\n";
	}
	return s;
    }

   
}
