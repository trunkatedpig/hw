import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Character c = new Character("Rushil");
	Character c2 = new Character("David");
	System.out.println(c);
	c.meleeAttack(c2);
    }
}
