public class Codingbat{

    public String stringTimes(String str, int n) {
        String result = "";
        for (; n > 0; n --){
            result = (result + str);
        }
        return result;

    }


}
