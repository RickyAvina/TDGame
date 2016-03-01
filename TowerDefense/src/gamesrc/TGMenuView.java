package gamesrc;

import java.awt.image.BufferedImage;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class TGMenuView extends GContainer {

	public static boolean play;
	
	public TGMenuView() {
		setSize(900, 700);
		play = false;

		MenuBackground mbg = new MenuBackground();
		addAtCenter(mbg);
		
		BufferedImage none = ImageCache.getImage("/none.png");
		BufferedImage hover = ImageCache.getImage("/hover.png");
		BufferedImage pressed = ImageCache.getImage("/pressed.png");
		
		GSprite none_img = new GSprite(none.getScaledInstance(100, 100, 0));
		GSprite hover_img = new GSprite(hover.getScaledInstance(100, 100, 0));
		GSprite pressed_img = new GSprite(pressed.getScaledInstance(100, 100, 0));

		GButton play_btn = new GButton();
		play_btn.setStateSprite(ButtonState.NONE, none_img);
		play_btn.setStateSprite(ButtonState.HOVERED, hover_img);
		play_btn.setStateSprite(ButtonState.PRESSED, pressed_img);

		addAt(play_btn, 400, 300);
		
		ButtonListener b = new ButtonListener(){
			@Override
			public void mouseClicked(Context context) {
				super.mouseClicked(context);
				play = true;
				TowerDefense.root.setCurrentView(TowerDefense.views.LEVEL_ONE);
			}
		};
		play_btn.addListener(b);
	}
}
