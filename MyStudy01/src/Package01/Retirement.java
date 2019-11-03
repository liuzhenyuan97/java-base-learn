package Package01;
import java.util.*;
/**
 * 测试while
 * @author liuzhenyuan
 *
 */

public class Retirement {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);//输入命令
		
		System.out.print("How much money do you need to retire?");//退休金总额
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year?");//每年存钱
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");//利息率
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while(balance<goal){
			balance += payment;//每年收入
			double interest = balance * interestRate / 100; //每年利息收入
			balance += interest;//收入加利息收入
			years++;
		}
		
		System.out.println("You can retire in "+ years + "years");
		
	}
	
}
