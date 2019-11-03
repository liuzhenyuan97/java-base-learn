package Package01;
import java.util.*;
/**
 * ����while
 * @author liuzhenyuan
 *
 */

public class Retirement {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);//��������
		
		System.out.print("How much money do you need to retire?");//���ݽ��ܶ�
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year?");//ÿ���Ǯ
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");//��Ϣ��
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while(balance<goal){
			balance += payment;//ÿ������
			double interest = balance * interestRate / 100; //ÿ����Ϣ����
			balance += interest;//�������Ϣ����
			years++;
		}
		
		System.out.println("You can retire in "+ years + "years");
		
	}
	
}
