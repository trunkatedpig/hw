public class Driver{
	public static void main(String[] agrs){
		PigLatinify p = new PigLatinify();
		PigLatinify a = new PigLatinify();
		PigLatinify t = new PigLatinify();
		PigLatinify g = new PigLatinify();
		PigLatinify h = new PigLatinify();
		PigLatinify j = new PigLatinify();
		p.Latin("reel");
		a.Latin("ant");
		t.Latin("there");
		g.Latin("eggplant");
		h.Latin("hogwarts");
		j.Latin("shower");

		
		System.out.println(p.PigLatin());
		System.out.println(a.PigLatin());
		System.out.println(t.PigLatin());
		System.out.println(g.PigLatin());
		System.out.println(h.PigLatin());
		System.out.println(j.PigLatin());

}}
