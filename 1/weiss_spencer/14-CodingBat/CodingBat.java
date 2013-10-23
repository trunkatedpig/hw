public class CodingBat{
        public boolean sameStarChar(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if (str.substring(i, i++).equals("*") && i == 0 || i == (str.length() - 1)){
                newStr = newStr + "true";
            }
            else if (str.substring(i, i + 1).equals("*")){
                if (str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))){
                    newStr = newStr + "true";
                }
                else{
                    newStr = newStr + "false";
                }
            }
        }
        if (newStr.contains("false")){         // looked this up
            return false;
        }
        else {
            return true;
        }
    }
}

// Need to add other problem
