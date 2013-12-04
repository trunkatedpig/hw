public class Stuff {
    public boolean sameStarChar(String str) {
        for (int i=1; i<str.length()-1; i++) {//search
            if (str.substring(i,i+1).equals("*")) {//find
                if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
                    return false;
                }
            }
        }
        return true;
    }
    public String sameEnds(String string) {
        String first = string.substring(0,string.length()/2);//begining index to half of length
        String last = string.substring(string.length()/2+ string.length() %2);//start index to end and accounts for even or odd
        for (int i=0; i<first.length(); i++) {
            if (first.substring(0,first.length()-i).equals(last.substring(i))) {
                return first.substring(0,first.length()-i);//scaling down to find the equal ends
            }
        }
        return "";
    }
}
