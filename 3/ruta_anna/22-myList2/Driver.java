import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	System.out.println();
	System.out.println("*-* Testing class myList *-*");
	System.out.println();

	myListInt L = new myListInt();

	System.out.println("PART 1: TESTING  INT ARRAY");
	System.out.println("Array L:");
	System.out.println(L);
	System.out.println();

	System.out.println("Modify Array L to count up by Fives (start from 5):");
	for (int i = 0; i<5;i++) {
		    L.add((i+1)*5);
	}
	System.out.println(L);
	System.out.println();

	System.out.println("Add 5 additional elements to Array L, which continue pattern:");
	for (int i = 0; i<5;i++) {
		    L.add(25+(i+1)*5);
	}
	System.out.println(L);
	System.out.println();

	System.out.println("Remove element at position(index) 4 of Array L:");
	System.out.println("The value of the removed element: " + L.remove(4));
	System.out.println(L);
	System.out.println();

	System.out.println("Insert element 25 at position(index) 4 of Array L:");
	L.insert(4,25);
	System.out.println(L);
	System.out.println();

	System.out.println("Change the value of element at position 5 to 100 in Array L:");
	L.set(5,100);
	System.out.println(L);
	System.out.println("The value of the element at position 5: " + L.get(5));
	System.out.println();

	System.out.println("The size of Array L: " + L.size());
	System.out.println();

	System.out.println("Find the element with a value of 100: " + L.find(100));
	System.out.println("Find the element with a value of 2: " + L.find(2));
	System.out.println();

	System.out.println("Find and remove the first element with value 100: ");
	L.fremove(100);
	System.out.println(L);
	System.out.println();

	myListString S = new myListString();

	System.out.println("================================================");
	System.out.println("PART 2: TESTING STRING ARRAY");
	System.out.println("Array S:");
	System.out.println(S);
	System.out.println();

	System.out.println("Modify Array S to have various greetings:");
	S.add("Hey");
	S.add("Whats up?");
	S.add("Go Away!");
	S.add("Good Morning");
	S.add("Howdy");
	System.out.println(S);
	System.out.println();

	System.out.println("Add 2 additional elements to Array S:");
	S.add("Hello");
	S.add("Sup");
	System.out.println(S);
	System.out.println();

	System.out.println("Remove element at position(index) 4 of Array S:");
	System.out.println("The message of the removed element: " + S.remove(4));
	System.out.println(S);
	System.out.println();

	System.out.println("Insert message 'How you doing?' at position(index) 4 of Array S:");
	S.insert(4,"How you doing?");
	System.out.println(S);
	System.out.println();

	System.out.println("Change the message of element at position 5 to 'Hola' in Array S:");
	S.set(5,"Hola");
	System.out.println(S);
	System.out.println("The message of the element at position 5: " + S.get(5));
	System.out.println();

	System.out.println("The size of Array S: " + S.size());
	System.out.println();

	System.out.println("Find the element with message 'Go Away!': " + S.find("Go Away!"));
	System.out.println("Find the element with message 'Eww': " + S.find("Eww"));
	System.out.println();

	System.out.println("Find and remove the first element with message 'Sup': ");
	S.fremove("Sup");
	System.out.println(S);
	System.out.println();
	}
}