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

    public String pigLatinfy(String sentence) {
        String first, sub;
        first = sentence.substring(0,1);
        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") || first.equals("y")) {
            sentence = sentence + "way";
        }
        else {
            for (int x = 1; x < sentence.length(); x++) {
                sub = sentence.substring(x,x+1);
                if (sub.equals("a") || sub.equals("e") || sub.equals("i") || sub.equals("o") || sub.equals("u") ||
                    sub.equals("A") || sub.equals("E") || sub.equals("I") || sub.equals("O") || sub.equals("U")) {
                    sentence = sentence.substring(x) + sentence.substring(0,x) + "ay";
                    break;
                }
            }
        }
        return sentence;
    }
}
