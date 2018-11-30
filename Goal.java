package infTerrSim;

public class Goal extends Swamp {
	/////////////////////// Attributes///////////////////////

	private String type;

	/////////////////////// Constructors/////////////////////

	public Goal(int vTileNo, String vTileType) {
		super(vTileNo, vTileType);
		this.type = "Chest";
	}

	////////////////////////// Methods///////////////////////

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
