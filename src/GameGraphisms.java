package src;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GameGraphisms {
    
    // Chemin des images
    /*
    String platformPath = "";
    String wallPath = "";
    String cloudPath = "";
    String speedPath = "";
    String rangePath = "";
    String stengthPath = "";
    */    

    public static BufferedImage platform = ImageIO.read(new File(""));
    public static BufferedImage wall = ImageIO.read(new File(""));
    public static BufferedImage cloud = ImageIO.read(new File("")); 
    public static BufferedImage speed = ImageIO.read(new File(""));
    public static BufferedImage range = ImageIO.read(new File(""));
    public static BufferedImage strength = ImageIO.read(new File(""));

    public GameGraphisms()
    {

    }
}
