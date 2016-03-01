package gamesrc;

import java.awt.image.BufferedImage;

import jgame.GSprite;

public abstract class Enemy extends GSprite {
	
	public Enemy(BufferedImage image) {
		super(image);
	}
	
	public abstract double getX();
	
	public abstract double getY();
}
