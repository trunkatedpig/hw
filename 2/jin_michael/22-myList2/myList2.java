import java.util.*;

public class myList2{
    int[] data;

    public myList2(int d){
	data=new int[d];}

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
}
