public class Driver {
    public static void main(String[] args){
	CoinGame cg1 = new CoinGame();
	/*cg1.turn();
	System.out.println(cg1.getFace1());
	System.out.println(cg1.getFace2());
	System.out.println(cg1.getBalance1());
	System.out.println(cg1.getBalance2());
	System.out.println(cg1.getBalancePot());
	cg1.turn();
        System.out.println(cg1.getFace1());
        System.out.println(cg1.getFace2());
        System.out.println(cg1.getBalance1());
        System.out.println(cg1.getBalance2());
        System.out.println(cg1.getBalancePot());
	cg1.turn();
        System.out.println(cg1.getFace1());
        System.out.println(cg1.getFace2());
        System.out.println(cg1.getBalance1());
        System.out.println(cg1.getBalance2());
        System.out.println(cg1.getBalancePot());
	*/
	cg1.play(50);
	System.out.println(cg1.getFace1());
        System.out.println(cg1.getFace2());
        System.out.println(cg1.getBalance1());
        System.out.println(cg1.getBalance2());
        System.out.println(cg1.getBalancePot());



    }
}