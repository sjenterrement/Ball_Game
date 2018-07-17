package core;

import java.awt.Image;

import constant.Constant;
import util.GameUtil;
import util.ImageUtil;

public class Ball extends BallGameObject {

	boolean right = true;

	public Ball() {
		// TODO Auto-generated constructor stub
	}

	public Ball(int x, int y, String key) {
		this.x = x;
		this.y = y;
		this.img = util.ImageUtil.images.get(key);
		this.speed = 5;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if (right) {
			x += speed;
		} else {
			x -= speed;
		}
		
		if (x>Constant.GAME_WIDTH-this.width-55) {
			right=false;
		}
		
		if (x<55) {
			right=true;
		}

	}
}
