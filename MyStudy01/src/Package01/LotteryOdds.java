package Package01;
import java.util.*;//����util����
/**
 * ����ѭ��
 * @author liuzhenyuan
 *
 */
public class LotteryOdds {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);//��������
		
		System.out.print("����Ҫ���ٸ����룿");
		int k = in.nextInt();
		
		System.out.print("��������Ƕ��٣�");
		int n = in.nextInt();
		
		/*
		 * �н�����Ϊ n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*....*k)
		 */
		
		long lotteryOdds = 1;
		for(long i = 1;i<=k;i++){
			lotteryOdds = lotteryOdds*(n-i+1)/i;
		}
		
		System.out.println("���ͷ���ĸ�����1/"+lotteryOdds+",Good luck!");
		
	}
	
}
