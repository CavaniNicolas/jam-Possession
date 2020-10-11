package src;

import java.awt.Color;
import java.awt.Graphics;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import javax.swing.JPanel;

public class Map extends JPanel {

	char mapArray[][] = new char[3][10];
	final int mapSpeedX = 3;
	static int mapPosX = 0;

	int mapHeight = 1_500;
	int mapWidth = 2_000;

	Characters player = new Characters(0, 0, 0, 0, 0, 0, 80, 300);
	boolean playing = true;

	public Map() {
	}

    public Map(String fileName) {
		
		try {
			File myObj = new File(fileName);
			Scanner myReader = new Scanner(myObj);
			int i = 0;
			while (myReader.hasNextLine() && i < 3) {
				String line = myReader.nextLine();
				for (int j=0; j<line.length(); j++) {
					this.mapArray[i][j] = line.charAt(j);
				}
				i++;
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }

	
	/**Fonction d'affichage principale */
	public void paintComponent(Graphics g) {

		g.setColor(Color.yellow);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		drawGrid(g);

		player.drawPlayer(g);
	}

	void drawGrid(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(0, this.getHeight()/3, this.getWidth(), this.getHeight()/3);
	}

	void moveCamera() {
		mapPosX += mapSpeedX;
	}
}
