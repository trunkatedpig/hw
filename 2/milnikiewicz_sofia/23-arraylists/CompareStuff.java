import java.io.*;
import java.util.*;


public class CompareStuff{
    public ArrayList <Integer> a = new ArrayList <Integer>();

    public CompareStuff(int n){
        for (int i=1;i<=n;i++){
	    a.add(i);
        }
    }
    
    public ArrayList getStuff(){
	return a;
    }

    public void addme(int t){
	for (int j = 0 ; j<t; j++){
	    a.add(j);
	}
    }

    public void addme2(int t){
	for (int j = 0 ; j<t; j++){
	    a.add(0,j);
	}
    }

    public void removeme(int t){
	for (int j = 0 ;j<t; j++){
	    a.remove(0);
	}
    }

    public void removeme2(int t){
	for (int j = 0 ; j<t; t--){
	    a.remove(t-1);
	}
    }

    public ArrayList reverseme(){
        ArrayList<Integer> b = new ArrayList<Integer>(); 
	for (int i = a.size()-1 ;i>=0; i--){
	    b.add(a.get(i));
	    
	}
	return b;
    }
   
}
