package towergame;
import jgame.GContainer;


public class TGLevelOneView extends GContainer{
	
		private LevelOnePlayArea levelOnePlayArea = new LevelOnePlayArea();
	//	private MenuArea menuArea = new MenuArea();
	//	private InfoArea infoArea = new InforArea();
		
		public TGLevelOneView(){
			setSize(900, 700);
			levelOnePlayArea.setAnchorTopLeft();
			levelOnePlayArea.setLocation(100, 0);
			add(levelOnePlayArea);
		}
}
