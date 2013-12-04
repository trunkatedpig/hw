import java.util.*;
import java.io.*;

public class ArrayListReverser{    
    public static void main(String[] args){
	
	
    ArrayList<Object> varAList = new ArrayList<Object>();
    varAList.add("Hello");
    varAList.add("Pupitre");
    varAList.add("ImFirst");
    
    for (int splitSize = varAList.size()/2;
	 splitSize != 0;
	 splitSize--){
	
	
	Object lastTemp = varAList.get(varAList.size() - 1);
	Object firstTemp = varAList.get(0);
	
	varAList.remove(0);
	varAList.add(0, lastTemp);
	
	varAList.remove(varAList.size() - 1);
	varAList.add(lastTemp);
	
	 }
	
	
	}}
