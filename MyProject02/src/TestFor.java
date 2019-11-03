/**
 * 测试for 循环
 * @author liuzhenyuan
 *
 */
public class TestFor {

	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum = sum + i;
		}
		System.out.println(sum);
		/*
		 *1执行初始化 i=1；2判断i<=100,执行 sum = sum + i；再i++; 
		 */
		
	}
	
}
