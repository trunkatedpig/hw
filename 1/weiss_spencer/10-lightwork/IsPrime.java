import java.io.*;
import java.util.*;

// Worked with Andrew Sikowitz

public class IsPrime{
    public boolean isPrime(int n){
	for (int i = 2; i < n; i++){
	    if (n % i == 0){
		return false;
	    }
	}
	return true;
    }
}