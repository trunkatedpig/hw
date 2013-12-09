public class Greeter{
    public String happygreeting, sadgreeting;
    public Greeter(String H, String S){
	happygreeting = H;
	sadgreeting = S;
    }
    public Greeter(){
	happygreeting = "Hello ";
	sadgreeting = "Hello ";
    }
    public void setHappy(String H){
	happygreeting = H;
    }
    public void setSad(String S){
	sadgreeting = S;
    }
    public String happyGreet(String Name){
	return happygreeting + " " + Name;
    }
    public String sadGreet(String Name){
	return sadgreeting + " " + Name;
    }
}
