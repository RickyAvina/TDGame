package gamesrc;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;
import jgame.SoundManager;

public class TowerDefense extends Game {
	static GRootContainer root;

	public static void main(String[] args) {
		ImageCache.create(TowerDefense.class, "/rsc/");
		SoundManager.create(TowerDefense.class, "/rsc/");
		TowerDefense tg = new TowerDefense();
		tg.startGame("Game");
	}

	public TowerDefense() {
		root = new GRootContainer(Color.black);
		setRootContainer(root);
		
		TGMenuView tgmv = new TGMenuView();
		root.addView(views.MAIN_MENU, tgmv);
		
		TGLevelOneView tgl1v = new TGLevelOneView();
		root.addView( views.LEVEL_ONE, tgl1v);
		
		TGGameOverView tggov = new TGGameOverView();
		root.addView(views.GAME_OVER, tggov);
	}

	public enum views {
		MAIN_MENU, LEVEL_ONE, GAME_OVER;
	}
}
