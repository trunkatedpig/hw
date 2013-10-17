import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	StringStuff name = new StringStuff();
	System.out.println(name.capitalize("anjelika amog"));
	System.out.println(name.bondify("ANJelikA AMoG"));
	System.out.println(name.bondify("James Bond"));
	System.out.println(name.bondify("aldric amog"));
	System.out.println(name.pigLatinify("egg"));
	System.out.println(name.pigLatinify("chocolate"));
	System.out.println(name.pigLatinify("Homework"));
    }
}