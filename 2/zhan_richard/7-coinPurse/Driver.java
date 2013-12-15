public class Driver{
    public static void main(String[] args){
	coin c,c1,c2,c3;
	coinPurse p,p1;
	c =new coin("Penny");
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getFace());
	System.out.println(c.getHead());
	System.out.println(c.getTail());
	System.out.println(c.getTosses());
	p =new coinPurse(c);
	System.out.println(p.getPurse());
	c1 = new coin("Dime");
	c2 = new coin("Quarter");
	p1 = new coinPurse(c1);
	p1.addTo(c2);
	System.out.println(p1.getPurse());
	c3 = new coin("Nickel");
	p1.removeFrom(c3);
	System.out.println(p1.getPurse());
    }
}
