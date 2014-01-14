public class TestDecrypt {
	public static void main(String[] args) {
		CaesarCipher c = new CaesarCipher("Pride_and_Prejudice.txt");
		String s = "Vaqvtrabhf crbcyrf yvirq va jung vf abj gur Havgrq Fgngrf sbe gubhfnaqf bs lrnef naq qrirybcrq pbzcyrk phygherf orsber Rhebcrna pbybavfgf ortna gb neevir, zbfgyl sebz Ratynaq, nsgre 1600. Gur Fcnavfu unq rneyl frggyrzragf va Sybevqn naq gur Fbhgujrfg, naq gur Serapu nybat gur Zvffvffvccv Evire naq Thys Pbnfg. Ol gur 1770f, guvegrra Oevgvfu pbybavrf pbagnvarq gjb naq n unys zvyyvba crbcyr nybat gur Ngynagvp pbnfg, rnfg bs gur Nccnynpuvna Zbhagnvaf. Nsgre qevivat gur Serapu bhg bs Abegu Nzrevpn va 1763, gur Oevgvfu vzcbfrq n frevrf bs arj gnkrf juvyr erwrpgvat gur Nzrevpna nethzrag gung gnkrf erdhverq ercerfragngvba va Cneyvnzrag. Gnk erfvfgnapr, rfcrpvnyyl gur Obfgba Grn Cnegl bs 1774, yrq gb chavfuzrag ol Cneyvnzrag qrfvtarq gb raq frys-tbireazrag va Znffnpuhfrggf. Nyy 13 pbybavrf havgrq va n Pbaterff gung yrq gb nezrq pbasyvpg va Ncevy 1775. Ba Whyl 4, 1776, gur Pbaterff nqbcgrq gur Qrpynengvba bs Vaqrcraqrapr qensgrq ol Gubznf Wrssrefba, cebpynvzrq gung nyy zra ner perngrq rdhny, naq sbhaqrq n arj angvba, gur Havgrq Fgngrf bs Nzrevpn.";
		System.out.println(c.decryptIntelligent(s));
		String[] decryptions = c.decryptBruteForce(s);
		for (int i = 0; i < 26; i++) {System.out.println("" + i + ": " + decryptions[i]);}
	}
}
