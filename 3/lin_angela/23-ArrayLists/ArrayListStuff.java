import java.util.*;
import java.io.*;

public class ArrayListStuff {



    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> r = new ArrayList<Integer>();


    public void addv1(int n){
	int index = 0;
	while (index<n){
	    a.add(index,1);
	    index++;
	}
    }

    public void addv2(int n){
	int index = 0;
	while (index <n){
	    a.add(1);
	    index ++;
	}
    }

    public void removeFront(){
	while (a.size()>0){
	    a.remove(0);
	}
    }

    public void removeBack(){
	while (a.size()>0){
	    a.remove(a.size()-1);
	}
    }



    public ArrayList<Integer> reverse(){
	int i = 0;
	ArrayList<Integer> temp = new ArrayList<Integer>();
	while (i < a.size()){
	    temp.add(i, a.get((a.size()-1)-i));
	    i++;
	}
	a = temp;
	return a;
    }


   

}








