public class Greeter{

    private String happygreeting;
    private String sadgreeting;

    public Greeter(){
	happygreeting = "Smile";
	sadgreeting = "Frown";
    }

    public Greeter(String h, String s){
	happygreeting = h;
	sadgreeting = s;
    }

    public void setHappy(String h){
	happygreeting = h;
    }

    public void setSad(String s){
	sadgreeting = s;
    }

    public String happyGreet(String name){
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadGreet(String name){
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}