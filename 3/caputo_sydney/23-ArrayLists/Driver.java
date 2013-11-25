import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	ArrayStuff a;
	a= new ArrayStuff();
	
	System.out.println(a.firstadd(1000000));
	System.out.println(a.secondadd(100000,100));
	//second add much slower, 1st add= 5
	//2nd add= 113
	System.out.println(a.removeFront());
	System.out.println(a.removeEnd());
	//removeFront much slower, when end took 14 milli seconds, end took
	//so long i couldnt wait for it 

    }





}
