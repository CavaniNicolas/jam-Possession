package src;

public class Actors {

	/** Gravite */
	final int GRAVITY = -20;

	// Coordonnees de collisions minimales et maximales
	public int minX = 0;
	public int maxX = 2_000;
	public int minY = 110;
	public int maxY = 1_200;

	// Largeur et Hauteur de l'entite	
	int width;
	int height;

	// Coordonnees de l'entite
	public int x;
	public int y;
	// Vitesses de l'entite
	int speedX;
	int speedY;
	// Accelerations de l'entite
	int accelX;
	int accelY;


	public Actors(int x, int y, int speedX, int speedY, int accelX, int accelY, int width, int height) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.accelX = accelX;
		this.accelY = accelY;
		this.width = width;
		this.height = height;
	}


	/**Deplace l'entite */
	public void moveXY() {
		moveX();
		moveY();
	}


	/** Deplace l'entite selon X*/
	public void moveX() {
		speedX += accelX;

		// Collision a gauche, on conserve le max
		if (minX > x + speedX) {
			x = minX;
		} else {
			x = x + speedX;
		}

		// Collision a droite, on conserve le min
		if (maxX < x) {
			x = maxX;
		}

	}


	/** Deplace l'entite selon Y*/
	public void moveY() {
		speedY += accelY;

		// Collision au plafond
		if (maxY < y + speedY) {
			y = maxY;
			speedY = 0;
		}

		// Collision au sol, on conserve le max (on est au sol)
		if (minY > y + speedY) {
			y = minY;
			speedY = 0;
			accelY = 0;

		// Sinon on tombe, on conserve le min
		} else {
			y = y + speedY;
		}

	}


	/* ======= */
	/* Setters */
	/* ======= */

	public void setAcceleration(int accelX, int accelY) {
		this.accelX = accelX;
		this.accelY = accelY;
	}

	public void setSpeed(int speedX, int speedY) {
		this.speedX = speedX;
		this.speedY = speedY;
	}


	public int getMinX() {
		return minX;
	}
	public void setMinX(int minX) {
		this.minX = minX;
	}
	public int getMaxX() {
		return maxX;
	}
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	public int getMinY() {
		return minY;
	}
	public void setMinY(int minY) {
		this.minY = minY;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
