package gamesrc;

import java.awt.Color;
import java.awt.Image;
import java.util.List;

import jgame.GContainer;
import jgame.ImageCache;

public class menuArea extends GContainer {

	public menuArea() {
		setSize(100, 600);
		setBackgroundColor(Color.gray);
		
		for(int i = 0; i < 5; i++){
			setTile(i);
		}
	}
	
	List <Image> tileImages = ImageCache.getSequentialImages("d", 1, 5, ".png");
	
	private void setTile(int i){
		Tile tile = new Tile(tileImages.get(i),  i);
		tile.setAnchorTopLeft();
		tile.setScale(0.9);
		tile.setX(4);
		tile.setY(110 * i + 25);
		add(tile);
	}
}
