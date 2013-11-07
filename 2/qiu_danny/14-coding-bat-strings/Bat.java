public class Bat {

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i+1).equals("*")) {
                if (!str.substring(i-1, i).equals(str.substring(i+1, i+2))) {
                    return false;
                }
            }
        }
    return true;
    }

    public String sameEnds(String string) {
        String same, test;
        same = "";
        for (int i = 1; i < string.length(); i++) {
            test = string.substring(0, i);
            if (string.indexOf(test, i) != -1) {
                same = test;
            }
        }
        return same;
    }
}
