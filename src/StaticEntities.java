package src;

import java.awt.image.BufferedImage;

public class StaticEntities {

    // position
    int posX;
    int posY;


    int width;
    int height;

    TypeEntitie typeEntite;

    private BufferedImage image;

    

    public StaticEntities(char entitie)
    {
        

        switch(entitie)
        {
            case 'P':
                this.image = GameGraphisms.plateforms;
                typeEntite = TypeEntitie.Platform;
                this.width = 100;
                this.height = 10;
                break;
            case 'W';
                this.image = GameGraphisms.wall;
                typeEntite = TypeEntitie.Wall;
                this.width = 100;
                this.height = 500;
                break;
            case 'C':
                this.image = GameGraphisms.cloud;
                typeEntite = TypeEntitie.Cloud;
                this.width = 100;
                this.height = 500;
                break;
            case 'S':
                this.image = GameGraphisms.speed;
                typeEntite = TypeEntitie.Speed;
                this.width = 50;
                this.height = 50;
                break;  
            case 'R':
                this.image = GameGraphisms.range;
                typeEntite = TypeEntitie.Range;
                this.width = 50;
                this.height =50;
                break;
            case 'F':
                this.image = GameGraphisms.strength;
                typeEntite = TypeEntitie.Strength;
                this.width = 50;
                this.height = 50;
                break;
        }

    }

    public enum TypeEntitie
    {
        Platform,
        Wall,
        Cloud, 
        Speed,
        Range,
        Strength;
    }  

    
}
