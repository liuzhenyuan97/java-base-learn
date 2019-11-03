package Package01;
import java.util.*;//导入util方法
/**
 * 测试循环
 * @author liuzhenyuan
 *
 */
public class LotteryOdds {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);//设置输入
		
		System.out.print("你需要多少个号码？");
		int k = in.nextInt();
		
		System.out.print("号码最大是多少？");
		int n = in.nextInt();
		
		/*
		 * 中奖概率为 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*....*k)
		 */
		
		long lotteryOdds = 1;
		for(long i = 1;i<=k;i++){
			lotteryOdds = lotteryOdds*(n-i+1)/i;
		}
		
		System.out.println("获得头奖的概率是1/"+lotteryOdds+",Good luck!");
		
	}
	
}
