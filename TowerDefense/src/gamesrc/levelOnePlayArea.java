package gamesrc;

import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class levelOnePlayArea extends GContainer {
	
	public levelOnePlayArea() {
		setSize(800, 600);
		BufferedImage bg = ImageCache.forClass(TowerDefense.class).get("bg.jpg");
		GSprite gs = new GSprite(bg);
		setBackgroundSprite(gs);
	}
}
