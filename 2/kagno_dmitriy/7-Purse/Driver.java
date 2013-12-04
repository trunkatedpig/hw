import java.util.*;

public class Driver{
    public static void main(String[] args){
        Coin q,d,n,p;
	Purse p1,p2;
       	q = new Coin("quarter");
	q.flip();
	q.flip();
	q.flip();
	System.out.println(q.getFace());
	System.out.println(q.getHead());
	System.out.println(q.getTail());
	p1 =new Purse();
	System.out.println(p1.getAmount());
	d = new Coin("dime");
	n = new Coin("nickel");
	p = new Coin("penny");
	p2 = new Purse(d);
	p2.addTo(p);
	System.out.println(p2.getAmount());
	p2.removeFrom(n);
	System.out.println(p2.getAmount());
    }}
	
