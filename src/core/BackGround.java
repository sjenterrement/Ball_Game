package core;

import util.GameUtil;

public class BackGround extends BallGameObject{
	
	public BackGround() {
		// TODO Auto-generated constructor stub
	}
	
	public BackGround(int x,int y,String key) {
		this.x=x;
		this.y=y;
		this.img = util.ImageUtil.images.get(key);
	} 
	
}
