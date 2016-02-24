package towergame;

import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class LevelOnePlayArea extends GContainer{
	
	public LevelOnePlayArea(){
		setSize(800, 600);
	    BufferedImage bg = ImageCache.forClass(TowerGame.class).get("grass.png");
	    GSprite gs = new GSprite(bg);
	    setBackgroundSprite(gs);
	}	
}
