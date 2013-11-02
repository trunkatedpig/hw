public Class PlayerCharacter{
    
    public void encounter(){
	System.Out.println("1 to attack, 2 to flee");
	int response = sc.nextline();
	if (response==1)
	    attack;
	if (response==2)
	    flee;
	else{
	    System.Out.println("your response is invalid");
	    encounter();
	}
    }

    public void attack(Character other){
	System.Out.println("-----------------");
	System.Out.println("1 to [], 2 to [], 3 to []");
	
	//control statements calling user attack, based on user input
	
	if(r.nextInt(100) >= dexterity) 
	    //determines if the attack hits, based on dexterity
	    other.hit(strength + r.nextInt(20) - r.nextInt(20));
	//makes things more interesting by making damage dealt
	//within a range of strength +- 20 
	
	else 
	    System.out.Println("Your attack missed!");
    }
}

