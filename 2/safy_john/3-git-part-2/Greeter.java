/*
   I had a lot of trouble with this homework. I guess I don't understand
   these concepts as well as I thought I did in class. This code is based off of
   James Chen's, who I asked for help. He told me I could use his code as a
   reference. I tried to at least consolidate it but now it doesn't work :(.
*/ 

import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting;

    public String sadgreeting;

    public Greeter() {
	setHappy("happy");
	setSad("sad");
    }

    public Greeter (String greet, String greet2){
	setHappy(greet);
	setSad(greet2);
    }

    public void setHappy (String mood1, String mood2) {
	happygreeting = mood1;
	sadgreeting = mood2;
   }
     
    public String greet (String name, String name2) {
	String message;
        message = name + " is " + happygreeting + "\n" + name2 + " is " + sadgreeting;
	return message;
    }}
