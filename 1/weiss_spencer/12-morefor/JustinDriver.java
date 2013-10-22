public class JustinDriver{
        public static void main(String[] args){
                JustinWeltz g = new JustinWeltz();
                System.out.println(g.diag(4));
		System.out.println(g.diag(5));
                System.out.println(g.diagWord("Hello"));
		System.out.println(g.diagWord("Regards"));
                System.out.println(g.fence(5, 8));
		System.out.println(g.fence(4, 4));
        }
}
