import java.util.*;

public class myListStr{
    public String[] data;
    public int numItems;

    public myListStr(int d){
	data=new String[d];
	numItems=d;}

    public void remove (int pos){
	for (int i=pos;i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]="";
    }

    public int size(){
	return data.length;}

    public String get(int pos){
	return data[pos];}

    public void set(int pos, String d){
	data[pos]=d;
    }

    public String toString(){
	String s=Arrays.toString(data);
	return s;}

    public String find(String n){
	for (int i=0;i<data.length;i++){
	    if (data[i]==n){
		return data[i];}}
	return "";}


    public void fremove(String d){
	for (int i=0;i<data.length;i++){
	    if (data[i]==d){
		remove(i);
		i=data.length;}}}

    public void insert (int pos, String d){
        String[] b=new String[data.length+1];
        for (int i=0;i<pos;i++){
            b[i]=data[i];}
        b[pos]=d;
        for (int i=pos+1;i<b.length;i++){
            b[i]=data[i-1];}
        data=b;
    }
    
    public boolean isFull() {
	return numItems >= data.length;
    }
    
    public void grow() {
	System.out.println("Growing from "+data.length+" to "+data.length*1.5);
	String[] tmpArray = new String[data.length + data.length/2];
	for (int i=0; i<data.length; i++) {
		    tmpArray[i] = data[i];
	}
	data = tmpArray;
    }

    public void add(int pos, String d) {
	if (isFull()) {
	    String[] ret = new String[data.length + 1];
	    for (int i = 0; i < numItems + 1; i++) {
		if (i < pos) {
		    ret[i] = data[i];
		} else if (i > pos){
		    System.out.println(i);
		    ret[i] = data[i-1];
		} else{
		    ret[pos] = d;
		}
	    }
	    data = ret;
	} else {
	    for (int i = numItems; i > pos; i--) {
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	numItems++;	
    }
}
