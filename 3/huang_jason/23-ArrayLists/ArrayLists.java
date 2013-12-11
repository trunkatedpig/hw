import java.util.*;
import java.io.*;

public class ArrayLists{

    ArrayList<Integer> a = new ArrayList<Integer>();

    public void addTest(int n){
        int i = 0;
        while(i<n){
         a.add(i);
         i = i+1;
        }
    }

    public void insertTest(int n){
        int i = 0;
        while(i<n){
         a.add(0,i);
         i = i+1;
        }
    }

    public void removeFrontTest(){
        while(a.size()>0){
	    a.remove(0);
        }
    }
    
    public void removeBackTest(){
        while(a.size()>0){
	    a.remove(a.size()-1);
        }
    }

    public ArrayList<Integer> reverse(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<a.size(); i++){
	    result.add(i,a.get((a.size()-1)-i));
        }
        a = result;
        return a;
    }

}

