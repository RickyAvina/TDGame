package gamesrc;

import java.awt.image.BufferedImage;

public class EnemyOne extends Enemy {

	public EnemyOne(BufferedImage image) {
		super(image);
	}

	@Override
	public double getX() {
		return 500;
	}

	@Override
	public double getY() {
		return 500;
	}
}
