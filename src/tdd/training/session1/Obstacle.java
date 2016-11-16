package tdd.training.session1;

public class Obstacle {
	
	private int coordX;
	private int coordY;
	
	public Obstacle(){
		coordX = -1;
		coordY = -1;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		int x = Integer.parseInt(coordX);
		this.coordX = x;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		int y = Integer.parseInt(coordY);
		this.coordY = y;
	}
	
	

}
