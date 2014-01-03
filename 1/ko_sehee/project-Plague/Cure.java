public class Cure{
    private double efficiency, cured;
    private int countTurns;
    public Cure(){
	efficiency = 1/100;
	cured = 0;
    }
    public void turn(){
	//*if random 100 < efficiency [cured increases by 2 + efficiency/2]
	// *efficiency increases by countturn/2 (IDK LOL, just as the countturn increases, cure has to be easier to develop)
	// *countturn increases by 1
	// *if cured = 1, then player loses
    }
}