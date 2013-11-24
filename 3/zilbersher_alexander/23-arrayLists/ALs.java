import java.util.*;
import java.io.*;

public class ALs {

    public long addBasic(ArrayList a) {
        long start = System.currentTimeMillis();
        for (int i = 10000;i>0;i--) {
            a.add("wow");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long addHard(ArrayList a) {
        long start = System.currentTimeMillis();
        for (int i = 10000;i>0;i--) {
            a.add(0,"wow");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long removeFront(ArrayList a) {
	long start = System.currentTimeMillis();
	while (a.size() > 0) {
	    a.remove(0);
	}
	long end = System.currentTimeMillis();
        return end - start;
    }

    public long removeBack(ArrayList a) {
	long start = System.currentTimeMillis();
	for (int i = a.size()-1;i>=0;i--) {
	    a.remove(i);
	}
	long end = System.currentTimeMillis();
        return end - start;
    }

    public void reverse(ArrayList a) { 
	//cannot just assign temp = a;
	//because then everything done to temp will 
	//affect a when using arraylists

	ArrayList temp = (ArrayList)a.clone();
	for (int j = 0;j<a.size();j++) {
	    temp.set(j,a.get((a.size()-j)-1));
	}
	a.clear();
	a.addAll(temp); 
	//for some reason a = (ArrayList)temp.clone();
	//will not work here
    }
        
}