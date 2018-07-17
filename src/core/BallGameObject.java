package core;

import java.awt.*;

import client.BallGameClient;




public abstract class BallGameObject implements Moveable,Drawable {
	
	//建立关系
	//调停者设计模式
	public BallGameClient bgc;
	public int x;
	public int y;
	public Image img;
	public int width;
	public int height;
	public int speed;
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, x, y, null);
		move();
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 获取图片相对应的图片大小
	 */
	public Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}

	
}
