package com.lzy.plane;

import javax.swing.JFrame;
import java.awt.event.*;

/**
 * 飞机游戏的窗口
 * @author liuzhenyuan
 *
 */
public class MyGameFrame extends JFrame {

	/*
	 * 初始化的窗口
	 */

	public void launchFrame(){
		this.setTitle("一个飞机游戏，玩具作品");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(500, 500);
		
		this.addWindowListener(new WindowAdapter(){
            
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		});
		
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
		
	}
	
}
