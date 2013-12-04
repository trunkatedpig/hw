public class Driver{
    public static void main(String[] args){
        StringStuff s;
        s = new StringStuff();
        
        System.out.println(s.capitalize("sungwoo park"));
        System.out.println(s.bondify("James Bond"));
        System.out.println(s.bondify("Sungwoo Park"));
        System.out.println(s.pigLatinify("ate"));
        System.out.println(s.pigLatinify("eat"));
        System.out.println(s.pigLatinify("inside"));
        System.out.println(s.pigLatinify("owl"));
        System.out.println(s.pigLatinify("umpire"));
        System.out.println(s.pigLatinify("hello"));
    }
}
