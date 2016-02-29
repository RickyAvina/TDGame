package gamesrc;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.ImageCache;
import jgame.controller.MouseLocationController;
import jgame.listener.LocalClickListener;

public class TGLevelOneView extends GContainer {
	
	private levelOnePlayArea l1pa = new levelOnePlayArea();
	private menuArea ma = new menuArea();
	private informationArea ia = new informationArea();
	
	public boolean settingTurret = false;
	
	public TGLevelOneView() {
		setSize(900, 700);
		
		l1pa.setAnchorTopLeft();
		l1pa.setLocation(100, 0);
		add(l1pa);
		
		ma.setAnchorTopLeft();
		ma.setLocation(0, 0);
		add(ma);
		
		ia.setAnchorTopLeft();
		ia.setLocation(0, 600);
		add(ia);
	}

	public void initializeTurret(int tn) {
		if(settingTurret){
			return;
		}
		settingTurret = true;
		
		Turret t = chooseTurret(tn);
		this.l1pa.addAt(t, 100, 100);
		
		final MouseLocationController mlc = new MouseLocationController();
		t.addController(mlc);
		
		final LocalClickListener dropListener = new LocalClickListener(){
			@Override
			public void invoke(GObject target, Context context) {
				target.removeController(mlc);
				target.removeListener(this);
				settingTurret = false;
			}
		};
		t.addListener(dropListener);
	}
	
	public Turret chooseTurret(int turretNumber){
		switch(turretNumber){
		case 0:
			return new TurretOne(ImageCache.getImage("d1.png"));
			
		case 1:
			return new TurretTwo(ImageCache.getImage("d2.png"));
			
		case 2:
			return new TurretThree(ImageCache.getImage("d3.png"));
			
		case 3:
			return new TurretFour(ImageCache.getImage("d4.png"));
			
		case 4:
			return new TurretFive(ImageCache.getImage("d5.png"));
			
			default:
				return null;
		}
	}
}
