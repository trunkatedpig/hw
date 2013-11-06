import java.io.*;
import java.util.*;

public class Array2{
    public int[] ReFill(int n){
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = n-i;
	    System.out.println(i);
	}
	return result;
    }
    public int[] makeRandom(int n, int min, int max){
	Random r = new Random();
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = r.nextInt(
}