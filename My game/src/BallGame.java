
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
   
	double x = 100;  //小球横坐标
	double y = 100;  //小球纵坐标
	boolean right = true; //方向
	//这是画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被画了一次");
        g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
        
		if(right){
			x = x+10;
		}
		else{
			x = x-10;
		}
		
		if(x>856-70){
			right = false;
		}
		
		if (x<40){
			right = true;
		}
		
		
	}
	
	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
	  //重画窗口   每秒25次
		while(true){
			repaint();
			try{
				Thread.sleep(40);  //40ms 1秒=1000毫秒，大约1秒画25次窗口
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}
	
    //main方法是程序执行的入口
	public static void main(String[] args){
		System.out.println("桌球小游戏");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
