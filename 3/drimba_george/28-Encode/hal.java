public class hal{   
    public static String encode(String s, int offset) {
        s.toLowerCase();
        String returnstring = "";
        for (char i : s.toCharArray()) {
            if (i > 96 && i < 123) {
                int j = i + offset;
                if (j > 122) 
                    j = j - 26;
                returnstring = returnstring + Character.toString((char)j);
            }
            else
                returnstring = returnstring + Character.toString((char)i);
        }
        return returnstring;
    }
   
    public static void main(String[] args) {
        System.out.println(encode("hello world this is a test",4));
        System.out.println(encode("abcdefghijklmnopqrstuvwxyz",6));
    }
}