import java.util.*;
import java.io.*;

public class PlayerCharacter{
    
    /*    public PlayerCharacter(){
	Scanner sc = new Scanner();
    }
    */

    Scanner sc = new Scanner();
    Random r = new Random();
    
    int strength = 100;
    int dexterity = 100;    
   
    public void encounter(){
	System.out.println("1 to attack, 2 to flee");
	int response = sc.nextline();
	if (response==1)
	    attack;
	if (response==2)
	    flee;
	else{
	    System.out.println("your response is invalid");
	    encounter();
	}
    }

    public void attack(Character other){
	System.out.println("-----------------");
	System.out.println("1 to [], 2 to [], 3 to []");
	
	//control statements calling user attack, based on user input
	
	if(r.nextInt(100) >= dexterity) 
	    //determines if the attack hits, based on dexterity
	    
	    //other.hit(strength + r.nextInt(20) - r.nextInt(20));
	
	    //makes things more interesting by making damage dealt
	    //within a range of strength +- 20 
	
	else 
	    System.out.println("Your attack missed!");
    }
} 