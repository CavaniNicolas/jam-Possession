package src;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**class MyWindow extends JFrame<p> 
 * Gere la fenetre et les saisies clavier
*/
public class MainGame extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1816999198544107363L;

	static int winWidth;
	static int winHeight;
	static double oneUnityHeight;
	static double oneUnityWidth;

	Map map;

	public MainGame() {
		createWindow();
	}


	/**Cree la fenetre principale*/
	public void createWindow() {
		this.setTitle("Possess Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Fenetre hors plein ecran : width = 80% et height = 90% (les proportions sont a peu pres conservees)
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		winWidth = (int)(screenSize.getWidth() * 0.8);
		winHeight = (int)(screenSize.getHeight() * 0.5);
		this.setSize(winWidth, winHeight);
		this.setLocationRelativeTo(null);
		// this.setLocation( (int)(screenSize.getWidth() * 0.1), (int)(screenSize.getHeight() * 0.05) );
		
		
		map = new Map("maps/map");
		// map = new Map();
		
		System.out.println(winWidth +" " + winHeight);
		oneUnityWidth = (double)winWidth / map.mapWidth;
		oneUnityHeight = (double)winHeight / map.mapHeight;
		System.out.println(oneUnityWidth +" " + oneUnityHeight);

		this.addKeyListener(this);
		this.setContentPane(map);
		this.setVisible(true);

		repaint();
		startGame();

		// Plein ecran
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// this.setUndecorated(true);

	}


	/** Le Main principal du jeu */
	public static void main(String[] args) {
		new MainGame();
	}


	@Override
	public void keyTyped(KeyEvent event) {
	}

	@Override
	public void keyPressed(KeyEvent event) {
		handleKey(event, true);
	}

	@Override
	public void keyReleased(KeyEvent event) {
		handleKey(event, false);
	}


	public void initGame() {
		// platform.loadAllImages();

		// platform.getSnake().initSnake(Platform.gameSize);
		// platform.createApples();
	}


	public void startGame() {
		while (map.playing) {
			repaint();

			sleep(16);

			map.moveCamera();

			map.player.checkMovement();
			map.player.moveXY();

			// map.checkCollisions();

		}
		repaint();
	}

	/**Delay */
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}

	/** sends input action to the board if the key is valid */
	public void handleKey(KeyEvent event, Boolean bool) {

		int code = event.getKeyChar();
		// System.out.print("Code clavier "+ code + "\n ");

		if (code == 122 && map.player.canUp) { // Si on veut aller Up mais pas si on va deja Down
			map.player.goUp = bool;
		}
		if (code == 115 && map.player.canDown) { // Si on veut aller Down mais pas si on va deja Up
			map.player.goDown = bool;
		}
		if (code == 113 && map.player.canLeft) { // Si on veut aller Left mais pas si on va deja Right
			map.player.goLeft = bool;
		}
		if (code == 100 && map.player.canRight) { // Si on veut aller Right mais pas si on va deja Left
			map.player.goRight = bool;
		}

	}

}
