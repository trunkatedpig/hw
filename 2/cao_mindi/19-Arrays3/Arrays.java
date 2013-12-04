import java.io.*;
import java.util.*;

public class Arrays{
    private int[] a;
    private Random r;

public double mean(){
    r = new Random();
    a = new int[r];
    double result = 0;
    for (int i = 0; i < a.length; i ++){
	result = result + a[i];
    }
    return result/a.length;
}

public double stddv(){
    r = new Random();
    a = new int[r];
    double result = 0;
    for (int i = 0; i < a.length; i ++){
	a[i] = (a[i] - a.mean())*(a[i] -a.mean());
    }
    return Math.sqrt(a.mean());
}
	
    
