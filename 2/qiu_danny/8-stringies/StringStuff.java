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
        String first, second, third, fourth;
        first = sentence.substring(0,1);
        second = sentence.substring(1,2);
        third = sentence.substring(2,3);
        fourth = sentence.substring(3,4);
        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") || first.equals("y")) {
            sentence = sentence + "way";
        }
        else if (second.equals("a") || second.equals("e") || second.equals("i") || second.equals("o") || second.equals("u")) {
            sentence = sentence.substring(1) + sentence.substring(0,1) + "ay";
        }
        else if (third.equals("a") || third.equals("e") || third.equals("i") || third.equals("o") || third.equals("u")) {
            sentence = sentence.substring(2) + sentence.substring(0,2) + "ay";
        }
        else if (fourth.equals("a") || fourth.equals("e") || fourth.equals("i") || fourth.equals("o") || fourth.equals("u")) {
            sentence = sentence.substring(3) + sentence.substring(0,3) + "ay";
        }
        return sentence;
    }
}
