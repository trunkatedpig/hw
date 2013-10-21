import java.io.*;
import java.util.*;

public class Rational {

    private int a;
    private int b;
    private double rat;



    public int gcd (int a, int b) {

	if (b==0) {
	    return a;

	}
	else {

	    return gcd (b, a % b);

	}

    }

	public void reduce () {

	   this.a = this.a / gcd (this.a,this.b);
	   this.b = this.b / gcd (this.a,this.b);

	}



public Rational (int a, int b) {

    setRat (a, b);
    rat = a / b;

}


public void setRat (int a, int b) {

    this.a = a;
    this.b = b;

    reduce ();


}


    public boolean equals (Rational other) {

	if ( (this.rat ) == (other.rat )) {
	    return true;

	}

	else { return false; }

    }

    public Rational mult (Rational other) {

	this.a = this.a * other.a;
	this.b = this.b * other.b;
	Rational g = new Rational (this.a, this.b);
        return g;
       



    }

    public int compareTo (Rational other) {

	    if ( this.equals ( other)  ) {

	    return 0;

	}

	else { 
	    if (this.rat < other.rat) {
		return -5;

	    }

	    else {

		return 5;

	    }

	}

    }



}

