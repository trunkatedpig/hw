import java.util.*;
import java.io.*;

public class ArrayLists{

    ArrayList<Integer> a = new ArrayList<Integer>();

    public void addTest(int n){
	for(int i=0; i<n; i++){
	    a.add(i);
        }
    }

    public void insertTest(int n){
	for(int i=0; i<n; i++){
	    a.add(0,i);
        }
    }

    public void removeFrontTest(){
	for(int i=a.size(); i>0; i--){
	    a.remove(0);
        }
    }
    
    public void removeBackTest(){
        for(int i=a.size(); i>0; i--){
	    a.remove(a.size()-1);
        }
    }

}

