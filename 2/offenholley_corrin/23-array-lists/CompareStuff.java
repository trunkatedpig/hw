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
//Granted, we may have done this together in class, but I feel like I'm taking a bit much, so here's an explanation of why this works:
//You loop through the list(pretty standard) and as you go, take the element you're on and put it at the end of the storage list.
//Since you start from the end of a, this effectively reverses a.
    public ArrayList reverseme(){
        ArrayList<Integer> b = new ArrayList<Integer>(); 
        for (int i = a.size()-1 ;i>=0; i--){
            b.add(a.get(i));
            
        }
        return b;
    }
   
}
