import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String [] args){

	Moreloops m = new Moreloops();
	System.out.println(m.Diagonal(5));
	System.out.println(m.Diagonalword("caspar"));
	System.out.println(m.Diagonalword("fahrtreppenbenutzungshinweise"));
	System.out.println(m.Fence(1, 2));
	System.out.println(m.Fence(3, 6));

	for(int i = 1; i <= 5 ; i ++){
	    System.out.println(i);
	}
    }
}
