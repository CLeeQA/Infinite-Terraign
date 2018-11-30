package infTerrSim;

public class Magic extends Player {

	/////////////////////// Attributes///////////////////////

	public String spellName;
	public String element;
	public int damage;

	/////////////////////// Constructors/////////////////////

	public Magic(String vName, int vHealth) {
		super(vName, vHealth);
		this.spellName = "Fireball";
		this.element = "Fire";
		this.damage = 3;
	}

	public Magic(String vSpellName, String vElement, int vDamage, String vName, int vHealth) {
		super(vName, vHealth);
		this.spellName = vSpellName;
		this.element = vElement;
		this.damage = vDamage;
	}

	////////////////////////// Methods///////////////////////

	public String getName() {
		return name;
	}

	public void setName(String vName) {
		this.name = vName;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String vElement) {
		this.element = vElement;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int vDamage) {
		this.damage = vDamage;
	}

	public void castSpell(String vName) {

	}

}
