package infTerrSim;

public abstract class Swamp extends Game {
	
	/////////////////////// Attributes///////////////////////

	public int tileNo;
	public String tileType;
	
	/////////////////////// Constructors/////////////////////

	public Swamp() {
		this.tileNo = 0;
		this.tileType = "Normal";
	}
	
	////////////////////////// Methods///////////////////////

	public int getTileNo() {
		return tileNo;
	}
	public void setTileNo(int tileNo) {
		this.tileNo = tileNo;
	}
	public String getTileType() {
		return tileType;
	}
	public void setTileType(String tileType) {
		this.tileType = tileType;
	}
	
}
