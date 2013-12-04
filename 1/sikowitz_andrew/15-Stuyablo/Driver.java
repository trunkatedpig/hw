public class Driver {
    public static void main(String[] args) {
	Character warrior = new Character("Warrior", 1000, 100, 10, 0);
	Character thief = new Character("Thief", 750, 50, 50, 10);
	Character wizard = new Character("Wizard", 400, 30, 0, 100);

	warrior.attack(thief);
	System.out.println(thief.getStatus());
	warrior.attack(wizard);
	System.out.println(wizard.getStatus());
	thief.attack(warrior);
	System.out.println(warrior.getStatus());
	thief.attack(wizard);
	System.out.println(wizard.getStatus());
	wizard.attack(warrior);
	System.out.println(warrior.getStatus());
	wizard.attack(thief);
	System.out.println(thief.getStatus());
    }
}
