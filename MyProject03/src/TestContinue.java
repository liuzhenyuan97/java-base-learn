/**
 * 测试continue语句
 * continue用于结束本次循环
 * @author liuzhenyuan
 *
 */
public class TestContinue {//输出100~150之间，不能被3整除，且每输出5个换行。
	public static void main(String[] args) {
		int count = 0;
		for(int i=100;i<150;i++){
			if(i%3==0){
				continue;
			}
			System.out.print(i+" 、");
			count++;
			if(count%5==0){
				System.out.println();
			}
		}
	}

}
