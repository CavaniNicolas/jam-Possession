package src;

import java.awt.image.BufferedImage;

public class GameGraphisms {
    
    String platfomPath = "";
    String wallPath = "";
    String cloudPath = "";
    String speedPath = "";
    String rangePath = "";
    String stengthPath = "";
    

    public BufferedImage platform = ImageIO.read(new File(platfomPath));
    public BufferedImage wall = ImageIO.read(new File(wallPath));
    public BufferedImage cloud = ImageIO.read(new File(cloudPath)); 
    public BufferedImage speed = ImageIO.read(new File(speedPath));
    public BufferedImage range = ImageIO.read(new File(rangePath));
    public BufferedImage strength = ImageIO.read(new File(stengthPath));

    public void GameGraphisms()
    {

    }
}
