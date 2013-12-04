import java.io.*;
import java.util.*;

public class arrays2 {
    public int[] RevFill ( int n ) {
	int[] ans = new int [ n ];
	for ( int i = 0 ; i < n ; i++ )
	    ans [ i ] = n - i;
	return ans;
    }

    public int[] MakeRandom ( int size , int min , int max ) {
	int[] ans = new int [ size ];
	for ( int i = 0 ; i < size ; i++ ) {
	    Random r = new Random();
	    ans [ i ] = r.nextInt ( max ) + min;
	    }
	return ans;
    }

    public int sum13(int[] nums) {
	int i = 0;
	int ans = 0;
	while ( i < nums.length ) {
	    if ( nums [ i ] == 13 )
		i = i + 2;
	    else {
		ans = ans + nums [ i ];
		i = i + 1;
	    }
	}
	return ans;
    }

    public boolean modThree(int[] nums) {
	for ( int i = 0 ; i < nums.length - 2 ; i++ ) {
	    if ( nums [ i ] % 2 == 0 && nums [ i + 1 ] % 2 == 0 && nums [ i + 2 ] % 2  == 0 )
		return true;
	    if ( nums [ i ] % 2 == 1 && nums [ i + 1 ] % 2 == 1 && nums [ i + 2 ] % 2 == 1 )
		return true;
	}
	return false;
    }
}
