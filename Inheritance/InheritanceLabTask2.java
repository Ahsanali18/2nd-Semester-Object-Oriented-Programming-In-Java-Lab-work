package Inheritance;
/*
(-) Create a base class Character with properties like health, attack, and defense.
(-) Inherit specific character classes like Warrior, Mage, and Archer from Character Class.
(-) Each subClass can inherit specific skills and attack methods based on their type.
(-) You can introduce another level of inheritance for character, races like HumanWarrior or ElfMage.
This creates a character class hierarchy with shared attributes and specialized abilities for different types. */

class Character{
	String health;
	String attack;
	String defense;
	
	public Character(String health, String attack, String defense){
		this.health=health;
		this.attack=attack;
		this.defense=defense;
	}
	
	public String toString() {
		return health+" "+attack+" "+defense;
	}
}

class Warrior extends Character{

	public Warrior(String health, String attack, String defense) {
		super(health, attack, defense);
	}
	public void attack() {
		System.out.println("Warriros attacks with strength!");
	}
}
class Mage extends Character{

	public Mage(String health, String attack, String defense) {
		super(health, attack, defense);
	}
	public void castSpell() {
		System.out.println("Mage casts a powerfull Spell!");
	}
}
class Archer extends Character{
	public Archer(String health, String attack, String defense){
		super(health, attack, defense);
	}
	public void shootArrow() {
		System.out.println("Archer shoots arrows very precisely!");
	}
}
 //						Now Implementing the HumanWarrior and ElfMage
class HumanWarrior extends Warrior{
	public HumanWarrior(String health, String attack, String defense) {
		super(health,attack,defense);
	}
	
	public void charge() {
		System.out.println("Human warriors charges into battles....!");
	}
}

class ElfMage extends Mage{
	public ElfMage(String health, String attack, String defense) {
		super(health,attack,defense);
	}
	
	public void teleport() {
		System.out.println("ElfMage teleports to Safety...!");
	}
}

public class InheritanceLabTask2 {

	public static void main(String[] args) {
		Warrior warrior=new Warrior("High","Moderate","High"); 
		Mage mage=new Mage("Low","High","Low");
		Archer archer=new Archer("Moderate","Moderate","Moderate");
		
		HumanWarrior humanwarrior= new HumanWarrior("Moderate","Moderate","Moderate");
		ElfMage elfmage= new ElfMage("Low","Moderate","High");
		
		System.out.println("Displaying Warriror Information:");
		System.out.println("Health,Attack,Defense --> "+warrior.toString());
		warrior.attack();
		System.out.println("-----------------------------------------------------");
		

		System.out.println("Displaying Mage Information:");
		System.out.println("Health,Attack,Defense --> "+mage.toString());
		mage.castSpell();
		System.out.println("-----------------------------------------------------");

		System.out.println("Displaying Archer Information: ");
		System.out.println("Health,Attack,Defense --> "+archer.toString());
		archer.shootArrow();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Human Warrior Information");
		System.out.println("Health,Attack,Defense--> "+humanwarrior.toString());
		humanwarrior.charge();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Elf Mage Information");
		System.out.println("Health,Attack,Defense--> "+elfmage.toString());
		elfmage.teleport();
		
	}

}
