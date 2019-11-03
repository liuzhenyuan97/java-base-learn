package com.lzy.game;

import java.awt.Color;
import java.awt.Graphics;

/**
 * �ڵ���
 * @author liuzhenyuan
 *
 */
public class Shell extends GameObject {

	double degree;
	
	public Shell(){
		x = 200;
		y = 200;
		width = 5;
		height = 5;
		speed = 8;
		degree = Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		
		g.fillOval((int)x, (int)y, width, height);
		
		//�ڵ���������Ƕ�ȥ��
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(x<0||x>Constant.GAME_WIDTH-width){
			degree = Math.PI-degree;			
		}
		
		if(y<40||y>Constant.GAME_HEIGHT-height){
			degree = -degree;			
		}
		
		
		g.setColor(c);
		
	}
	
}
