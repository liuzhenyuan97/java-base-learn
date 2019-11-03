package Package01;
import java.util.*;
/**
 * ��ά������㲻ͬ���ʵ�����
 * @author liuzhenyuan
 *
 */

public class CompoundInterest {

	public static void main(String[] args){
		
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//�趨��������10��15%
		double [] interestRate = new double [NRATES];
		for(int j = 0; j<interestRate.length;j++)
			interestRate [j] = (STARTRATE + j)/100.0;
		
		
		double [] [] balances = new double [NYEARS][NRATES];
		
		//�趨��ʼ����10000
		for (int j = 0;j<balances[0].length;j++)
			balances [0][j] = 10000;
		
		
		//����δ��������
		for (int i = 1;i<balances[i].length;i++){
			//��õ�ȥ�������
			for (int j = 0;j<balances.length;j++){
			double oldBalance = balances[i-1][j];
			//��������
			double interest = oldBalance*interestRate[j];
			//����ÿһ��������
			balances[i][j] = oldBalance + interest;
			}
		}
		
		//��ӡÿ�������
		for(int j = 0;j< interestRate.length;j++)
		System.out.printf("%9.0f%%", 100*interestRate[j]);
		
		System.out.println();
		
		//��ӡ������
		for (double[] row:balances){
			//��ӡ�����
			for(double b : row)
				System.out.printf("%10.2f", b);
		
		
		//��ӡ�հ���
		System.out.println();
		
		}
	}
	
}
