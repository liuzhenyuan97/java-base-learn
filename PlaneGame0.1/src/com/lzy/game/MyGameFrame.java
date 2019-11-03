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
 * �ɻ���Ϸ�Ĵ���
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
	int period;//��Ϸ����ʱ��
	
	@Override
	public void paint(Graphics g){ //�Զ������� g �൱��һ֧����
        Color c = g.getColor();
		g.drawImage(background, 0, 0, null);

		plane.drawSelf(g);//���ɻ�
		
		//�������ڵ�
		for (int i=0;i<shell.length;i++){
		shell[i].draw(g);
		
		//��ײ���
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
		//��ʱ���ܣ�������ʾ
		if(!plane.live){
		g.setColor(Color.GREEN);
		Font f = new Font("����",Font.BOLD,50);
		g.drawString("���ʱ�䣺"+period+"��", (int)plane.x, (int)plane.y);
		}

		
		}
	}
	
	//�������ظ����ػ�����
	class PaintThread extends Thread{
		
		@Override
		public void run(){
			while (true){
				repaint();//�ػ�

				try{
					Thread.sleep(40);//1s = 1000ms;
				}catch(InterruptedException e){
					e.printStackTrace();
				}				
			}
		}
	}
	
	//������̼������ڲ���
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
	 * ��ʼ���Ĵ���
	 */

	public void launchFrame(){
		this.setTitle("���ӵ�");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(0, 0);
		
		this.addWindowListener(new WindowAdapter(){
            
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		});
		
		new PaintThread().start();//�����ػ��Ĵ��ڵ��߳�
		addKeyListener(new KeyMonitor());//���Ӽ��̼���
		
		
		//��ʼ����ʮ���ڵ�
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