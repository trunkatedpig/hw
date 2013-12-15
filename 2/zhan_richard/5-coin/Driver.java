import java.util.*;

public class Driver{
    public static void main(String[] args){
	newcoin c,c1,c2;
	c=new newcoin();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getHead());
	System.out.println(c.getTail());
	System.out.println(c.getFace());
	System.out.println(c.getTosses());
    }
}
