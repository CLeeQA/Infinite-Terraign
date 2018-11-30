package infTerrSim;

public abstract class Player extends Game {

	/////////////////////// Attributes///////////////////////

	public String name;
	public int health;

	/////////////////////// Constructors/////////////////////

	public Player(String vName, int vHealth) {
		super();
		this.name = vName;
		this.health = vHealth;
	}

	////////////////////////// Methods///////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
