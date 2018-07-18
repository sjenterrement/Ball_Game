package client;

import java.awt.Graphics;

import core.BackGround;
import core.Ball;
import core.MyFrame;

public class BallGameClient2 extends MyFrame{
	
	
	
	//desk
	BackGround desk_01=new BackGround(0, 0, "desk_01");
	
	//ball
	Ball ball_01=new Ball(100, 100, "ball_01",1);
	
	@Override
	public void launchGame() {
		// TODO Auto-generated method stub
		super.launchGame();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		desk_01.draw(g);
		
		ball_01.draw(g);
		
	}
	
	public static void main(String[] args) {
		new BallGameClient2().launchGame();
	}
}
