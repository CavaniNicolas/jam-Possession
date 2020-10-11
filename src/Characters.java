package src;

import java.awt.Color;
import java.awt.Graphics;

public class Characters extends Actors {

	StatsCharacter SC = new StatsCharacter();

	int speed = 6;
	int strength;
	int range;

	boolean canUp = true;
	boolean canDown = true;
	boolean canRight = true;
	boolean canLeft = true;

	boolean goUp = false;
	boolean goDown = false;
	boolean goRight = false;
	boolean goLeft = false;


	public Characters(int x, int y, int speedX, int speedY, int accelX, int accelY, int width, int height) {
		super(x, y, speedX, speedY, accelX, accelY, width, height);
	}

	public void checkMovement() {
		speedX = 0;
		if (goLeft) {
			speedX = -speed;
		}
		if (goRight) {
			speedX = speed;
		}
	}

	public void drawPlayer(Graphics g) {
		g.setColor(Color.red);
		int x = this.x - Map.mapPosX;
		System.out.println(this.y);
		int y = (int)((double)(1500 - (this.y + this.height)) * MainGame.oneUnityHeight);
		int width = (int)((double)(this.width) * MainGame.oneUnityWidth);
		int height = (int)((double)(this.height) * MainGame.oneUnityHeight);
		// System.out.println(width + " " + height);
		g.fillRect(x, y, width, height);
	}
}
