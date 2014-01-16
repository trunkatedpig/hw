import java.io.*;
import java.util.*;

public class Sorting {

    Random random = new Random ();
    private int numItems = 0;
    private int numItems2 = 0;
    private int [] numbers;
    private ArrayList [] buckets;
    private int compareNumber;
    private int swapNumber;
    private int assignments;

    public Sorting (int n, int digitas) { //n is the amount of elements in the array, digitas in the digits of the units

	    int daNumba = 0;

	    numbers = new int [n];

	for (int i = 0; i < n; i ++) {


	    for (int r = 0; r < digitas; r ++ ) {

		daNumba = daNumba + (int) (random.nextInt (10) * Math.pow (10, r));
	    }

	    /*
	    if (Math.pow (10, digitas - 1 ) > daNumba) {
		daNumba = (int) ( daNumba + Math.pow (10, digitas - 1));

		}*/


	    numbers [i] = daNumba;

	    numItems = numItems + 1;
	    daNumba = 0;
	    }


	  buckets = new ArrayList [n];

	for (int i = 0; i < numbers.length; i ++) {
	    buckets [i] = new ArrayList ();
	}


	}



    public void Order () {

	int tempStore = String.valueOf (numbers [0]).length ();

	for (int i =1; i < numbers.length; i++) {


	    if  ( String.valueOf (numbers [i] ).length () > tempStore ) {

		tempStore = String.valueOf (numbers [i] ).length ();

	    }

	}

	int digits = tempStore;


	for (int n =0; n < digits; n ++) {
	    for (int i = 0; i < numbers.length; i ++) {


	    int teller = 0;
	    
	    teller =(int) ( ( numbers [i] / (Math.pow (10, n) ) ) % 10);

	    buckets [teller].add (numbers [i] );

	    numItems = numItems - 1;

	    }

	    for (int i = 0; i < numbers.length; i ++ ) {

		int cholata = 0;
		cholata = buckets [i].size ();

		while (cholata > 0) {

		    numbers [numItems2] = (Integer) buckets [i].get (0);
		    buckets [i].remove (0);
		    cholata = cholata - 1;

		    numItems2 = numItems2 + 1;

		}


	    }

	    numItems2 = 0;
	

	 

	}

    }


    public void bubbleSort () {

	for (int p = 0; p < numbers.length - 1; p++) {


	for (int i = 0; i <numbers.length - 1; i++) {

	    compareNumber = compareNumber + 1;
	    if (numbers [i] > numbers [i+1]) {
		swapNumber = swapNumber + 1;
		int n = numbers [i];
		numbers [i] = numbers [i + 1];
		numbers [i + 1] = n;

	    }

	}

    }

    }

  public void InsertionSort () {

	int temp = 0;


	for (int i = 1; i < numbers.length; i++) {
	    temp = numbers [i];
	   boolean counter = true;


	    if (numbers [i] < numbers [i-1] ) {
		compareNumber = compareNumber + 1;

		for (int n = 0; n < i; n++) {
		
		    if (counter) {

		    if (numbers [i] < numbers [n]) {

			compareNumber = compareNumber + 1;

			for (int m = i; m > n; m--) {

			    numbers [m] = numbers [m-1];
			    swapNumber = swapNumber + 1;
			}

			numbers [n] = temp;
			swapNumber = swapNumber + 1;
			counter = false;

		    }

		    }

		}

	    }

	}

  }

   

    public void SelectionSort () {

	int index = 0;
	int temp2 = 0;

	for (int i = 0; i < numbers.length; i++) {

	    temp2 = numbers [i];
	    index = i;

	    for (int p = i; p < numbers.length; p++) {

		if (temp2 > numbers [p]) {
		    compareNumber = compareNumber + 1;
		    temp2 = numbers [p];
		    index = p; 
		}

	    }

	    numbers [index] = numbers [i];
	    numbers [i] = temp2;
	    swapNumber = swapNumber + 2;
	   
	}

    }
	

    public String toString () {
	   return Arrays.toString (numbers);
	}


    public int [] getArray () {
	return numbers;

    }

    public int getCompareNumber () {

	return compareNumber;
    }

    public int getSwapNumber () {
	return swapNumber;
    }

    }
