package src;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameGraphisms {
    
    // Chemin des images
    
    String platformPath = "./OIP.png";
    String wallPath = "";
    String cloudPath = "";
    String speedPath = "";
    String rangePath = "";
    String stengthPath = "";
      
    
    public static BufferedImage platform = null;
    public static BufferedImage wall = null;
    public static BufferedImage cloud = null; 
    public static BufferedImage speed = null;
    public static BufferedImage range = null;
    public static BufferedImage strength = null;
    


    public GameGraphisms()
    {
        loadImage(platform, platformPath);
        loadImage(wall, wallPath);
        loadImage(cloud, cloudPath);
        loadImage(speed, speedPath);
        loadImage(range, rangePath);
        loadImage(strength, stengthPath);


    }

    public void loadImage(BufferedImage img, String path)
    {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
