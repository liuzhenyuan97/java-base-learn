/**
 * 测试循环语句的break
 * @author liuzhenyuan
 *
 */
public class TestBreak { 
	public static void main(String[] args){
		int total = 0;//定义计数器。
		System.out.println("Begin");
		while(true){
			total++;//每次循环计数加1；
			int i = (int)Math.round(100*Math.random());
			System.out.println(i);
			if (i==88){//当i为88时，退出循环。
				break;
			}
		}
		//循环输出的次数
		System.out.println("Game over,used"+total+"times");
	}	
}
