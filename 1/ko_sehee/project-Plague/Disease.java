public class disease{
    private double infected,dead,chanceInfected,chanceDead;
    private int  DNAPoints;
    private string name;
    private  boolean nausea,coughing,rash,anemia; 
    public disease(n){
	name = n;
	infected = 0;
	dead = 0;
	chanceInfected = .1;
	chanceDead = .01;
	DNAPoints = 0;
    }

    //all these methods for if player chooses to (1) UPGRADE    
    public String upgradeTransmission(name) {
	if (name == "nausea"){
	    chanceInfected = chanceInfected + .02;
	    nausea=true;
	    System.out.println("nausea turned ON.");
	}
	else if (name == "coughing"){	
	    chanceInfected = chanceInfected + .02;
	    coughing = true;
	}
	else if (name == "rash"){
	    chanceInfected = chanceInfected + .02;
	    rash = true;
	}
	else if (name == "anemia"){
	    chanceInfected = chanceInfected + .02;
	    anemia = true;
	}
    }

    public void upgradeSymptoms {
    }


    public void upgradeTransmissioeAbilitiesn {
    }

    //only happens if player chooses to (2)WAIT AND ANALYZE
    public turn(int choice) {
	if (Math.random() < chanceInfected) {
	    infected = infected + 2 + (chanceInfected/2);
	}
	if (Math.random() chanceDead) {
	    dead = dead + 2 + (chanceDead/2);
	}

	if (Math.random() < chanceInfected+chanceDead) {
	    DNAPoints = DNAPoints + 2;
	}
    }
	    
	

    //in turn mechanism if dead = 1, then player WINS end da game
	
       
