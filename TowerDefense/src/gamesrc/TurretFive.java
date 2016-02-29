package gamesrc;

import java.awt.Image;

import jgame.ImageCache;

public class TurretFive extends Turret {
	public TurretFive(Image image) {
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
