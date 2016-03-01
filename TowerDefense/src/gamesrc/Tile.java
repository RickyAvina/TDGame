package gamesrc;

import java.awt.Image;
import java.awt.image.BufferedImage;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class Tile extends GButton {
	
	public Tile(Image image, int turretNumber) {
		
		setSize(90, 90);
		
		BufferedImage none = ImageCache.getImage("/none.png");
		BufferedImage hover = ImageCache.getImage("/hover.png");
		BufferedImage pressed = ImageCache.getImage("/pressed.png");
		
		GSprite none_img = new GSprite(none.getScaledInstance(100, 100, 0));
		GSprite hover_img = new GSprite(hover.getScaledInstance(100, 100, 0));
		GSprite pressed_img = new GSprite(pressed.getScaledInstance(100, 100, 0));
		
		setStateSprite(ButtonState.NONE, none_img);
		setStateSprite(ButtonState.HOVERED, hover_img);
		setStateSprite(ButtonState.PRESSED, pressed_img);
		
		GSprite tIcon = new GSprite(image);
		addAtCenter(tIcon);
		
		addListener(new ButtonListener(){
			public void mouseClicked(Context context){
				getFirstAncestorOf(TGLevelOneView.class).initializeTurret(turretNumber);
			}
		});
	}

}
