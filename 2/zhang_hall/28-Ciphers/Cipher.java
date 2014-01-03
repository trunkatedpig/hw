public class Cipher {

        public static void main(String [] args) {
                Cipher c = new Cipher();
                
                System.out.println(c.encode("hi there!",1));
        }
        
        
        public String encode(String s, int shift) {
                String result = s;
                result.toLowerCase();
                char[] chars = result.toCharArray();
                
                for (int i = 0; i <s.length(); i++) {
                        char c = chars[i];
                        if (c >= 97 && c <= 123) {
                                int x = c;
                                x = x + shift;
                                chars[i] = (char) x;
                        }
                        
                }
        
        return new String(chars);        
        }

}
