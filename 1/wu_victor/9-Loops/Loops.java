import java.io.*;
import java.util.*;

public class Loops {

    private int hold;

    public Loops () {
	hold = 1;
    }

    public int fact (int n) {
	if ( n == 0 )
	    return 1;
	else
	    return n * fact(n - 1);
    }

    public int fact2 (int n) {
	while (n > 0) {
	    hold = hold * n;
	    n = n - 1;
	}

	return hold;
    }

}
