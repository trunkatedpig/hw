public class CoinGame{
    public BankAccount a;
    public BankAccount b;
    public Coin y;
    public Coin z;
    public int pot=0;

    public CoinGame(BankAccount aa, BankAccount bb,Coin yy, Coin zz){
	a=aa;
	b=bb;
	y=yy;
	z=zz;
    }

    public void setPot(){
	int  n;
	n=(int)(100*Math.random());
       	a.removeFrom(n);
       	b.removeFrom(n);
       	pot=pot+(2*n);
    }
    public void turn(){
	setPot();
	if (y.flipCoin()=="heads" && z.flipCoin()=="heads"){
	    a.addTo(pot);
	    pot=0;}
	if (y.flipCoin()=="tails" && z.flipCoin()=="tails"){
	    b.addTo(pot);
	    pot=0;}}

    public String playgame(){
	turn();
	return ""+a.name+" has $"+a.amount+
".\n"+b.name+" has $"+b.amount+".\nPot now is $"+pot;}



    public String playgamextimes(int x){
	while (x>0){
	    turn();
	    x=x-1;}
	return ""+a.name+" has $"+a.amount+
    ".\n"+b.name+" has $"+b.amount+".\nPot now is $"+pot;
    }

}
