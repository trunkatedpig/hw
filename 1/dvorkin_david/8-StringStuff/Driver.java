import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        StringStuff s=new StringStuff();
        System.out.println (s.capitalize("david dvorkin"));
        System.out.println ("===================================");
        System.out.println (s.bondify("david dvorkin"));
        System.out.println ("===================================");
        System.out.println (s.PigLatinify("first"));
        System.out.println (s.PigLatinify("apple"));
        System.out.println (s.PigLatinify("shout"));

    }
}
