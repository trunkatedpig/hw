public class DriverFor {
    public static void main(String[] args) {
        
        For f = new For();

        System.out.println(f.GCD(105, 500));
        System.out.println(f.GCD(19,21));
        System.out.println(f.GCD(41234,12344));

        System.out.println(f.Reverse("Hello"));
        System.out.println(f.Reverse("Tell me a story"));
        System.out.println(f.Reverse("racecar"));

        System.out.println(f.table(5, 3));
        System.out.println(f.table(12, 12));
        System.out.println(f.table(50, 50));
    }
}
