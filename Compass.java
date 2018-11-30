package infTerrSim;

public class Compass extends Player {

	/////////////////////// Attributes///////////////////////

	public int distance;

	/////////////////////// Constructors/////////////////////

	public Compass(String vName, int vHealth) {
		super(vName, vHealth);
		this.distance = 0;
	}

	////////////////////////// Methods///////////////////////

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
