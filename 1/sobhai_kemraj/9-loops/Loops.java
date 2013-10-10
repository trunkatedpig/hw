import java.io.*;
import java.util.*;

public class Loops{
	public int fact(int n){
		if (n <= 1)
			return 1;
		else
			return n*fact(n-1);
	}
}
