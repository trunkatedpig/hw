import java.io.*;
import java.util.*;
public class Enemy  extends Character{
    private int i = 0;
    private Random r = new Random();
    //THIS IS MY MAKESHIFT DICTIONARY. ALL INDEXES MATCH.
    //MAPS CAN'T STORE INTS AND DOUBLES
    private String monsterPortrait;
    private String[] monsterNames = {
	"Centuar",
	"Cerberus",
	"Cyclops",
	"Demon",
	"Dragon",
	"Dust Bunny",
	"Fairy",
	"Faun",
	"Gargoyle",
	"Ghost",
	"Giant",
	"Medusa",
	"Minotaur",
	"Troll",
	"Vampire"};
    private String[] monsterPics = {
	"       ^\n      /_\\{)\n     |---) >   _\n      \\ /|(___( ~\n       V_|)---\\\\_\n        \\        \\",
	"                            /\\_/\\____,\n                  ,___/\\_/\\ \\  ~     /\n                  \\     ~  \\ )   XXX\n                    XXX     /    /\\_/\\___,\n                       \\o-o/-o-o/   ~    /\n                        ) /     \\    XXX\n                       _|    / \\ \\_/\n                    ,-/   _  \\_/   \\\n                   / (   /____,__|  )\n                  (  |_ (    )  \\) _|\n                 _/ _)   \\   \\__/   (_\n                (,-(,(,(,/      \\,),),)",
	"            _......._\n        .-'.'.'.'.'.'.`-.\n      .'.'.'.'.'.'.'.'.'.`. \n     /.'.'               '.\\\n     |.'    _.--...--._    |\n     \\    `._.-.....-._.'  /\n     |     _..- .-. -.._   |\n  .-.'    `.   ((@))  .'   '.-.\n ( ^ \\      `--.   .-'     / ^ )\n  \\  /         .   .       \\  /\n  /          .'     '.  .-    \\\n ( _.\\    \\ (_`-._.-'_)    /._\\)\n  `-' \\   ' .--.          / `-'\n      |  / /|_| `-._.'\\   |\n      |   |       |_| |   /-.._\n  _..-\\   `.--.______.'  |\n       \\       .....     |\n        `.  .'      `.  /\n          \\           .'\n           `-..___..-`",
	"     (_(\n    ('')\n  _  '\\ )>,_     .-->\n  _>--w/((_ >,_.'\n         ///\n         '`'     ",
	"                                          _   __,----'~~~~~~~~~`-----.__\n                                   .  .    `//====-              ____,-'~`\n                   -.            \\_|// .   /||\\\\  `~~~~`---.___./\n             ______-==.       _-~o  `\\/    |||  \\\\           _,'`\n       __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\\\        ,'\n    _-'      ,='    | \\\\`.    '',/~7  /-   /  ||   `\\.     /\n  .'       ,'       |  \\\\  \\_  '  /  /-   /   ||      \\   /\n / _____  /         |     \\\\.`-_/  /|- _/   ,||       \\ /\n,-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`\n          '         `-|      /|    )-'\\~'      _,--''\n                      '-~^\\_/ |    |   `\\_   ,^             /\\\n                           /  \\     \\__   \\/~               `\\__\n                       _,-' _/'\\ ,-'~____-'`-/                 ``===\\\n                      ((->/'    \\|||' `.     `\\.  ,                _||\n                                 \\_     `\\      `~---|__i__i__\\--~'_/\n                                __-^-_    `)  \\-.______________,-~'\n                               ///,-'~`__--^-  |-------~~~~^'\n                                      ///,--~`-\\",
	"           .`:;ij;f,;,\n        .`;sk568G6itz,-',\n      .\\a\\x68888888886r/,-'\n    -._sV888P^98^'^9888k,-_'\n   `.-\\Q889'   '    `888/,-',\n   .-_J88f           188KJ-_.\n   ,-;388|    o o    |888[=-\n   _'.>88l           j88E:._'\n    _'Z3886._ ,J.__.488R=;.\n     .'/288888888888888S^._'\n     ''j^7Z988888885R^L`-.\n       ,'./jQV9TYVR\\[\\`'.\n          '|'|! |'|`. '\n          ./ l  | \\\n        .'_ _.\\ j, `._,.\n       (_)_)._) (_.__,._)",
	"                               {\\     /}\n                                >`.()'< \n                               {@ /|\\/@}\n                                `/'|`~'\n                                   \\\\\n                                   //\n                                  ''  ",
	"          ,~,\n          'J'\n     ===`===,\n       \\/\\_V)\n          | (\n          |##)-.\n          |/|/ '-~~\n          / /\n         W W",
	"                          _/    /U\\    \\_\n                        /' |   {`,'}   | `\\\n                      /'   `\\__/\\=/\\__/'   `\\\n                     /   |  /' |W|W| `\\  |   \\\n                    /    | | ,/ /I\\ \\, | |    \\\n                    |    \\  \\__  I `__/  /    |\n                    |   ,-\\-(  )~-~(  )-/-,   |\n                     \\ /     `\\ \\~/ /'     \\ /\n              ________\\|______| |_| |______|/______\n              |        \\      ``` '''      /       |",
	"         ___\n       _/ @@\\\n      ( \\  O/__\n       \\    \\__)\n       /     \\\n      /      _\\\n     `'''''``\n",
	"     __ (m)\n  __('')/ |\n ( (    ) /\n / |    | \n \\( (  ) )\n  /_|  |_\\ ",
	"            .--,\n           ( (`  ,--.\n      ,--.  ) )\\  `) ).--,\n       `) )/ /) ) ( (( (`\n       / /( (.  '-.) )) )\n   ,-.( ( /          / /,--,\n    `) \\ ` ==.    .==  ( (`\n    ( (_) ~6~      ~6~ _) )\n     \\_ (      )(      )_/\n    ,-,\\ \\     ^^     /\\ ,-.\n   ( (_/ /\\    __,   /\\ \\_) )\n    '._.' _\\  /__/  /_ '._.'\n      .--`  \\ `    /  `--.\n             '----'  \n",
        "           .:\\:/:.\n         .:\\:\\:/:/:.\n        :.:\\:\\:/:/:.:\n       :=.' -   - '.=:\n       '=(\\ 9   9 /)='\n          (  (_)  )\n          /`-vvv-'\\\n         /         \\\n        / /|,,,,,|\\ \\\n       /_//  /^\\  \\\\_\\\n       WW(  (   )  )WW\n        __\\,,\\ /,,/__\n       (______Y______)",

	"                     __.......__\n                  .-:::::::::::::-.\n                .:::''':::::::''':::.\n              .:::'     `:::'     `:::.\n         .'\\  ::'   ^^^  `:'  ^^^   '::  /`.\n        :   \\ ::   _.__       __._   :: /   ;\n       :     \\`: .' ___\\     /___ `. :'/     ;\n      :       /\\   (_|_)\\   /(_|_)   /\\       ;\n      :      / .\\   __.' ) ( `.__   /. \\      ;\n      :      \\ (        {   }        ) /      ;\n       :      `-(     .  ^'^  .     )-'      ;\n        `.       \\  .'<`-._.-'>'.  /       .'\n          `.      \\    \\;`.';/    /      .'\n            `._    `-._       _.-'    _.'\n             .'`-.__ .'`-._.-'`. __.-'`.\n           .'       `.         .'       `.\n         .'           `-.   .-'           `."
};

    private int[][] monsterStats = {
	//{initStr,initDex,initIntell,level*Str,level*Dex,level*Intell}
	{16,10,4,3,2,1},
	{10,16,3,2,3,1},
	{18,8,1,3,2,1},
	{11,13,12,3,2,2},
	{20,12,20,5,5,5},
	{7,18,10,1,3,2},
	{8,11,25,1,2,4},
	{9,14,16,1,2,2},
	{10,13,5,3,2,1},
	{4,14,24,1,2,3},
	{30,10,0,3,2,0},
	{9,12,12,1,3,3},
	{25,8,0,2,4,0},
	{10,10,10,2,3,2}};
    private double[][] monsterStats2 = {
	//{accuracy,crit,armor,evasion}
	{.85,.05,.05,.02},
	{.9,.05,0,.04},
	{.8,0,.05,0},
	{.8,0,.05,.03},
	{.85,.05,.1,0},
	{.8,.02,0,.20},
	{.8,0,0,.20},
	{1,0,0,.15},
	{.7,0,.4,.05},
	{.75,0,0,.66},
	{.5,0,0,0},
	{1,.1,.05,.1},
	{.65,0,0,.1},
	{.95,.05,.05,.08}};

    public Enemy(String n, Hero h){
	Random generator= new Random();
	level=h.getLevel() + generator.nextInt(3) - 1;
	while (level == 0 ){
	    level = h.getLevel() + generator.nextInt(3) - 1;
	}
	int index = Arrays.asList(monsterNames).indexOf(n);
	gold = level;
	str=monsterStats[index][0]+((level-1)*monsterStats[index][3]);
	dex=monsterStats[index][1]+((level-1)*monsterStats[index][4]);
	intell=monsterStats[index][2]+((level-1)*monsterStats[index][5]);
	monsterPortrait=monsterPics[index];
	maxHP=str*4;
	hP=maxHP;
	maxMP=intell*2;
	mP=maxMP;
	maxAP=10;
	aP=maxAP;
	minDamage=dex/4;
	maxDamage=dex/2;
	inventory= new ArrayList<Items>();
	name = n;
	ability = new ArrayList<Abilities>();
	spells = new ArrayList<Spells>();
	accuracy = monsterStats2[index][0];
	crit = monsterStats2[index][1];
	armor = monsterStats2[index][2];
	evasion = monsterStats2[index][3];
	exp = 10+(5*(level-1));
    }
    public String getPortrait(){
	return monsterPortrait;
    }
}
