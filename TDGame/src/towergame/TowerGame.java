package towergame;

import java.awt.Color;

import jgame.*;

public class TowerGame extends Game{
	
	public static void main(String [] args){
		ImageCache.create(TowerGame.class, "/towergame/images/");
		SoundManager.create(TowerGame.class, "towergame/sounds");
		TowerGame tg = new TowerGame();
		tg.startGame();
	}
	
	public TowerGame(){
		GRootContainer root = new GRootContainer(Color.BLACK);
		setRootContainer(root);
		
		TGLevelOneView levelOne = new TGLevelOneView();
		root.addView(Views.LEVEL_ONE, levelOne);
	}
	
	public enum Views {
		MAIN_MENU, LEVEL_ONE, INSTRUCTIONS;
	}
}
