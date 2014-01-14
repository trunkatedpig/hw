import java.io.*;
import java.util.*;

public class BubbleSort{
    int a;
    int countchecks;
    int countress;
    public BubbleSort(int[] s){
	int n=s.length;
	for (int i=0; i<n-1;i++){
	    for(int j=0;j<n-1;j++){
		countchecks++;
		if (s[j]>s[j+1]){
		    a=s[j];
		    s[j]=s[j+1];
		    s[j+1]=a;
		    countress++;
		}
	    }
	}
    }
}