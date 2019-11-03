
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
   
	double x = 100;  //С�������
	double y = 100;  //С��������
	
	double degree = 3.14/3;  //���ȣ��˴����ǣ�60��
	
	
	//���ǻ����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ�����һ��");
        g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
        
		x = x+ 10*Math.cos(degree);
		y = y +10*Math.sin(degree);
		
		if(y>430||y<80){  //500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������ĸ߶ȡ�
			degree = -degree;
		}
		
		//�������ұ߽�
		if(x<40||x>856-70){
			degree = 3.14 -degree;
			
		}
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
	  //�ػ�����   ÿ��25��
		while(true){
			repaint();
			try{
				Thread.sleep(40);  //40ms 1��=1000���룬��Լ1�뻭25�δ���
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}
	
    //main�����ǳ���ִ�е����
	public static void main(String[] args){
		System.out.println("����С��Ϸ");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
