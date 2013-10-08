import java.util.*;

public class Driver{
    public static void main(String[] args){
	 
	Coin c;
	c = new Coin();
	c.flip();
	
	System.out.println(c.getHead());
	System.out.println(c.getTail());
	System.out.println(c.getFace());		 
	System.out.println(c.getSame());
}
}
