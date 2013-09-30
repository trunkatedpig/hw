public class Driver {
    public static void main (String [] args){
    Coin c,c1,c2;

    c = new Coin();
    c.setFacehead();
    c.addCount();
    c.addCount();
    System.out.println(c.getFlips());
    c.resetCount();
    System.out.println(c.getFlips());
    System.out.println(c.getFace());
    }
}


