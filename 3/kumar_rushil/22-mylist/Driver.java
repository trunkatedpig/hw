import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	//int list
	/*
        myList list = new myList(20, 20);
        System.out.println(list);
        System.out.println(list.remove(4));
        System.out.println(list);
        list.add(4,200);
        System.out.println(list);
        System.out.println(list.find(-1));
        System.out.println(list.find(200));
        list.fremove(200);
        System.out.println(list);
	list.fremove(-200);
	*/
	//String list
	myStringList slist = new myStringList(20);
	System.out.println(slist);
	slist.add("Rushil");
	System.out.println(slist);
	System.out.println(slist.remove(0));
	System.out.println(slist);
    }
}
