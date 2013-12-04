import java.io.*;
import java.util.*;


public class Loops {

    private int total, counter;
    public int fact(int n){
	counter = n;
        total = n;
	if (counter == 1){
	    return total;
	}
	else {
	    counter = counter - 1;
	    total = total * fact(counter);
	    return total;
	}
    }

    private int total2,counter2;
    public int fact2(int n){
	counter2 = n;
	total2 = 1;
	while (counter2 > 0){
	    total2 = total2*counter2;
	    counter2 = counter2 - 1;
	}
	return total2;
    }
}
