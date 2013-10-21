import java.io.*;
import java.util.*;

public class forTest {

    /* Doesn't work because once for loop is done, i disappears. 
    public  forTest () {
    for (int i = 0; i < 10; i++) {

	//stuff

    }

    System.out.print (i);
    }

    */






    // Works. Returns 10. Since we've already created the variable, it doesn't dissapear after the for loop, and we reset the value to 0 at the beginning.

    int i = 100;

    public int forTesting() {

	for (i = 0; i < 10; i++) {

	    //stuff

	}

	return i;

    }

    







}


