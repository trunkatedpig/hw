import java.io.*;
import java.util.*;

//Worked with Ben the Roth Man

public class GCD {

    private int newDivisor;
    private int remainder;
    private int prime;



    public int returnGCD (int A, int B) {

        if (A > B) {


	    newDivisor = B;

	    while ((A % newDivisor) != 0 || (B % newDivisor) !=0) {

		newDivisor = newDivisor - 1;

	    }

	    return newDivisor;

	}




        else {

            newDivisor = A;

            while ((A % newDivisor) != 0 || (B % newDivisor) != 0 ) {


                newDivisor = newDivisor - 1;
            }


	    return newDivisor;




        }

    }





    public int returnGCD2 (int A, int B) {

        if (A > B) {

            remainder = B;

            while ((A % B) != 0) {
                remainder = (A % B);
                A = B;
                B = remainder;

            }

            return remainder;

        }

        else {

            remainder = A;

            while ((B % A) != 0) {

                remainder = (B % A);
                B = A;
                A = remainder;

	    }

            return remainder;

        }

    }


    public boolean isPrime (int n) {

        if (n == 1 || n == 0) {
            return true;

        }

	else {

	    prime = n-1;

	    while ( (n % prime) != 0 && prime != 1) {

		prime = prime - 1;

	    }

	    return (prime == 1);
		}

    }


}
