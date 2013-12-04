public class BankAccount{
    public String name;
    public int amount;

    public BankAccount(String n, int a){
	name=n;
	amount=a;
    }

    public void addTo(int c){
	amount= amount +c;
    }

    public void removeFrom(int c){
	amount=amount - c;
    }


}
