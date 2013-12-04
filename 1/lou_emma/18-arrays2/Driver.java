import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		arrays2 Test=new arrays2();
		System.out.println(Test.toString(Test.revFill(5)));
		System.out.println(Test.toString(Test.MakeRandom(5, 3, 100)));
	}
}