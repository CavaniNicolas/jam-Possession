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

	private Map map;

	public MainGame() {
		createWindow();
	}


	/**Cree la fenetre principale
	 * <p>
	 * La fenetre ne sera pas resizable par l'utilisateur (meme si le code y est adapte),
	 * mais il aura la possibilite dans le menu de passer d'un mode fenetre a un mode plein ecran.
	 */
	public void createWindow() {
		this.setTitle("Possess Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Fenetre hors plein ecran : width = 80% et height = 90% (les proportions sont a peu pres conservees)
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(screenSize.getWidth() * 0.8);
		int height = (int)(screenSize.getHeight() * 0.9);
		this.setSize(width, height);
		//this.setLocationRelativeTo(null);
		this.setLocation( (int)(screenSize.getWidth() * 0.1), (int)(screenSize.getHeight() * 0.05) );

		// // this.setResizable(false);
		// mainMenu = new MainMenu(this);

		map = new Map();

		// Plein ecran
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// this.setUndecorated(true);

		this.setVisible(true);
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
