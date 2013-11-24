import java.util.*;

public class Driver{
    
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    long t = System.currentTimeInMillis();
    
    public void Add1(){
	while (a.length < 1000){
	    a.add("");
	}
    }
    public void Add2(){
	while (b.length < 1000){
	    b.add("");
	}
    }
    public ArrayList reverse(){
        ArrayList<String> ans;
	int i = 0;
	while (ans.length < a.length){
	    ans.add(a.get(i));
	    i++;
	}
	return ans;
    }
    
    public static void main(String[] args){
    }
}