public class StringStuff {

	public static String capitalize(String name) {
		String newName = "";
		
		String[] names = name.split(" ");
		
		for (int x = 0; x <= names.length - 1; x = x + 1) {
			newName = newName + names[x].substring(0, 1).toUpperCase() + names[x].substring(1) + " ";
		}
		newName = newName.substring(0, newName.length() - 1); //get rid of last space for technicalities
		return newName;
	}
	
	public static String bondify (String name) {
		String newName = "";
		
		String[] names = name.split(" ");
		
		newName = newName + names[1] + ", " + names[0] + " " + names[1];
		
		return newName;
	}
}