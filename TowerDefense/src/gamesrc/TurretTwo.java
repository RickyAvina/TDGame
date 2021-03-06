package gamesrc;

import java.awt.Image;

import jgame.ImageCache;

public class TurretTwo extends Turret {
	public TurretTwo(Image image) {
		super(image);
	}

	@Override
	public Bullet createBullet() {
		return new Bullet(ImageCache.getImage("bullet.png"));
	}

	@Override
	public double getBulletSpeed() {
		return 30;
	}
}
