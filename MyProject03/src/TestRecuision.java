/**
 * 阶层
 * @author liuzhenyuan
 *
 */
public class TestRecuision {

	public static void main(String[] args){
		long d1 = System.currentTimeMillis();
		System.out.printf("%d乘阶的结果%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时:%s%n",d2-d1 );
		
		factorialLoop(10);
	}
	static long factorial(int n ){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);  //n*(n-1).......
		}
	}
	
	static long factorialLoop(int i){
		long d3 = System.currentTimeMillis();
		long result = 1;
		while(i>1){
			result = result*i*(i-1);
			i-=2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println(result);
		System.out.printf("普通循环费时：%s%n",d4-d3);
		return result;
	}
		
	
}

