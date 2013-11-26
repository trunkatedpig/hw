import java.util.*;

public class myList{
    int[] data;
    int numItems;

    public myList(int d){
	data=new int[d];
	numItems=d;}

    public void remove (int pos){
	for (int i=pos;i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]=0;
    }

    public int size(){
	return data.length;}

    public int get(int pos){
	return data[pos];}

    public void set(int pos, int d){
	data[pos]=d;
    }

    public String toString(){
	String s=Arrays.toString(data);
	return s;}

    public int find(int n){
	for (int i=0;i<data.length;i++){
	    if (data[i]==n){
		return data[i];}}
	return -1;}


    public void fremove(int d){
	for (int i=0;i<data.length;i++){
	    if (data[i]==d){
		remove(i);
		i=data.length;}}}

    public void insert (int pos, int d){
        int[] b=new int[data.length+1];
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
}
