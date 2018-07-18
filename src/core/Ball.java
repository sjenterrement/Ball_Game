package core;

import java.awt.Image;

import constant.Constant;
import util.GameUtil;
import util.ImageUtil;

public class Ball extends BallGameObject {

	boolean right = true;
	int type;
	double degree=3.14/3;

	public Ball() {
		// TODO Auto-generated constructor stub
	}

	public Ball(int x, int y, String key,int type) {
		this.x = x;
		this.y = y;
		this.img = util.ImageUtil.images.get(key);
		this.speed = 10;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.type=type;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		switch (type) {
		case 0:
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
			break;
		case 1:
			x=(int) (x+speed*Math.cos(degree));
			y=(int) (y+speed*Math.sin(degree));
			
			if (y>486-50-30||y<55) {
				degree=-degree;
			}
			
			if (x<50+5||x>866-50-30-5) {
				degree=3.14-degree;
			}
			
//			speed--;

		default:
			break;
		}
		

	}
}
