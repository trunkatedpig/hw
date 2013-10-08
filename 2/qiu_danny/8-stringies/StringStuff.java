public class StringStuff {
    
    public String capitalize(String name) {
        int i;
        String caps;

        i = name.indexOf(" ");
        caps = name.substring(0,1).toUpperCase() + name.substring(1,i+1) + name.substring(i+1,i+2).toUpperCase() + name.substring(i+2);
        return caps;
    }

    public String bondify(String name) {
        int i;
        String caps, bond;

        caps = capitalize(name);
        i = caps.indexOf(" ");
        bond = caps.substring(i+1) + ", " + caps;
        return bond;
    }
}
