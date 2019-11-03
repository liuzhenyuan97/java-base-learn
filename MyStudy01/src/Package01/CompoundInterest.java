package Package01;
import java.util.*;
/**
 * 二维数组计算不同利率的收益
 * @author liuzhenyuan
 *
 */

public class CompoundInterest {

	public static void main(String[] args){
		
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//设定年率利从10到15%
		double [] interestRate = new double [NRATES];
		for(int j = 0; j<interestRate.length;j++)
			interestRate [j] = (STARTRATE + j)/100.0;
		
		
		double [] [] balances = new double [NYEARS][NRATES];
		
		//设定初始本金10000
		for (int j = 0;j<balances[0].length;j++)
			balances [0][j] = 10000;
		
		
		//计算未来的收益
		for (int i = 1;i<balances[i].length;i++){
			//获得的去年的收益
			for (int j = 0;j<balances.length;j++){
			double oldBalance = balances[i-1][j];
			//计算收益
			double interest = oldBalance*interestRate[j];
			//计算每一年的收益合
			balances[i][j] = oldBalance + interest;
			}
		}
		
		//打印每年的利率
		for(int j = 0;j< interestRate.length;j++)
		System.out.printf("%9.0f%%", 100*interestRate[j]);
		
		System.out.println();
		
		//打印收益表格
		for (double[] row:balances){
			//打印表格列
			for(double b : row)
				System.out.printf("%10.2f", b);
		
		
		//打印空白行
		System.out.println();
		
		}
	}
	
}
