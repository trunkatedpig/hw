public class StringStuff{
    
    public String capitalize(String name){
        int indexSpace = name.indexOf(" ");
        String first =  name.substring(0,1).toUpperCase() + name.substring(1,indexSpace);
        String second = name.substring(indexSpace+1,indexSpace+2).toUpperCase() + name.substring(indexSpace+2);
        return first + " " + second;
    }

    public String bondify(String name){
        int indexSpace = name.indexOf(" ");
        String last = name.substring(indexSpace+1);
        return last + ", " + name; 
    }

    public String pigLatinify(String name){
        String firstLetter = name.substring(0,1);
        String result = "";
        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")){
            result = name + "ay";
         }else{
            result = name.substring(1) + firstLetter + "ay";
         }
        return result;
    }
}
