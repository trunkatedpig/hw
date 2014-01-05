public class Disease{
    private double infected,dead,chanceInfected,chanceDead;
    private int  DNAPoints;
    private String name;
    private  boolean nausea = false,coughing =false,rash=false,anemia=false,livestock=false,rodent=false,bird=false,insect=false,blood=false,air=false,water=false,coldR=false,headR=false,drugR=false,GeneticH=false,GeneticR=false;
    public Disease(string n){
	name = n;
	infected = 0;
	dead = 0;
	chanceInfected = .1;
	chanceDead = .01;
	DNAPoints = 0;
    }

    //all these methods for if player chooses to (1) UPGRADE
    
    public String upgradeTransmission(String name) {
	if (name == "livestock"){
	    chanceInfected = chanceInfected + .05;
	    livestock = true;
	}
	if (name == "rodent"){
	    chanceInfected = chanceInfected + .06;
	    rodent= true;
	}
	if (name == "bird"){
	    chanceInfected = chanceInfected + .05;
	    bird=true;	
	}
	if (name == "insect"){
	    chanceInfected = chanceInfected + .06;
	    insect =true;
	}
	if (name == "blood"){
	    chanceInfected = chanceInfected + .05;
	    blood =true;	
	}
	if (name == "air"){
	    chanceInfected = chanceInfected + .06;
	    air =true;	
	}
	if (name == "water"){
	    chanceInfected = chanceInfected + .05;
	    water =true;	
	}
    }

    public void upgradeSymptoms(String name) {
	if (name == "nausea"){
	    chanceInfected = chanceInfected + .01;
	    chanceDead = chanceDead + .03;
	    nausea=true;
	    System.out.println("nausea turned ON.");
	}
	else if (name == "coughing"){	
	    chanceInfected = chanceInfected + .02;
	    chanceDead = chanceDead + .04;
	    coughing = true;
	}
	else if (name == "rash"){
	    chanceInfected = chanceInfected + .01;
	    chanceDead = chanceDead + .03;
	    rash = true;
	}
	else if (name == "anemia"){
	    chanceInfected = chanceInfected + .02;
	    chanceDead = chanceDead + .05;
	    anemia = true;
	}
    
    }


    public void upgradeAbilities(String name){
	//you messed up variable names here and i didnt know how to fix it

	if (name == "coldR"){
	    coldResistance = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "heatR"){
	    coldResistance = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "drugR"){
	    coldResistance = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "GeneticH"){
	    coldResistance = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "GeneticR"){
	    coldResistance = true;
	    //efficiency of Cure is reduced by .04
	}
    }
    public String winner(){
	System.out.println ("Congratulations! Your disease, " +name + "has successfully destroyed the human population!");
    }
    public void winYet(){
	if (dead = 1){
		this.winner();
	    }
    }
    

    

    //only happens if player chooses to (2)WAIT AND ANALYZE
    public turn(int choice) {
	this.winYet();
	if (Math.random() < chanceInfected) {
	    infected = infected + 2 + (chanceInfected/2);
	    System.out.println("Infectivity: " +( chanceInfected*100 )+"%")
		System.out.println("Infected: " +( infected*100 )+"%")
		}
	//your forgot the inequality sign here so i just put less than 
	if (Math.random()< chanceDead) {
	    dead = dead + 2 + (chanceDead/2);
	    System.out.println("Severity: " +( chanceDead*100 )+"%")
		System.out.println("Dead: " +(dead*100 )+"%")
		}


	if (Math.random() < chanceInfected+chanceDead) {
	    DNAPoints = DNAPoints + 2;
	    System.out.println("DNA Points: " + DNAPoints))
	    }
}
	    
      
