package com.lzy.plane;

import javax.swing.JFrame;
import java.awt.event.*;

/**
 * �ɻ���Ϸ�Ĵ���
 * @author liuzhenyuan
 *
 */
public class MyGameFrame extends JFrame {

	/*
	 * ��ʼ���Ĵ���
	 */

	public void launchFrame(){
		this.setTitle("һ���ɻ���Ϸ�������Ʒ");
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
