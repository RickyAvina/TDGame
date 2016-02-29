package gamesrc;

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

		GSprite none_img = new GSprite(ImageCache.getImage("/none_img.png"));
		GSprite hover_img = new GSprite(ImageCache.getImage("/hover_img.png"));
		GSprite pressed_img = new GSprite(ImageCache.getImage("/pressed_img.png"));

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
