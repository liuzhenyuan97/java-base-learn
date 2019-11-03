package com.lzy.game;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.util.Date;

/**
 * 飞机游戏的窗口
 * @author liuzhenyuan
 *
 */
public class MyGameFrame extends Frame {

	Image planeImg = GameUtil.getImage("images/plane.png");
	Image background = GameUtil.getImage("images/background.png");
	
	Plane plane = new Plane(planeImg,500,500);
	Shell[] shell = new Shell[100];
	
	Explode boom ;
	Date startTime = new Date();
	Date endTime;
	int period;//游戏持续时间
	
	@Override
	public void paint(Graphics g){ //自动被调用 g 相当于一支画笔
        Color c = g.getColor();
		g.drawImage(background, 0, 0, null);

		plane.drawSelf(g);//画飞机
		
		//画所有炮弹
		for (int i=0;i<shell.length;i++){
		shell[i].draw(g);
		
		//碰撞检测
		boolean peng = shell[i].getRect().intersects(plane.getRect());
		if(peng){
			plane.live = false;
			if(boom == null){
			boom = new Explode(plane.x,plane.y);
			
			endTime = new Date();
			period = (int)((endTime.getTime()-startTime.getTime())/1000);
			}	
			boom.draw(g);
		}
		//计时功能，给出提示
		if(!plane.live){
		g.setColor(Color.GREEN);
		Font f = new Font("宋体",Font.BOLD,50);
		g.drawString("坚持时间："+period+"秒", (int)plane.x, (int)plane.y);
		}

		
		}
	}
	
	//帮助我重复的重画窗口
	class PaintThread extends Thread{
		
		@Override
		public void run(){
			while (true){
				repaint();//重画

				try{
					Thread.sleep(40);//1s = 1000ms;
				}catch(InterruptedException e){
					e.printStackTrace();
				}				
			}
		}
	}
	
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
             plane.minusDiretion(e);
		}
		
	}
	
	
	/*
	 * 初始化的窗口
	 */

	public void launchFrame(){
		this.setTitle("躲子弹");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(0, 0);
		
		this.addWindowListener(new WindowAdapter(){
            
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		});
		
		new PaintThread().start();//启动重画的窗口的线程
		addKeyListener(new KeyMonitor());//增加键盘监听
		
		
		//初始化五十个炮弹
		for(int i=0;i<shell.length;i++){
			shell[i] = new Shell();
		}
		
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
		
	}
	
	private Image offScreenImage = null;
	
	public void update(Graphics g){
		if(offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
}