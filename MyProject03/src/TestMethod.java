/**
 * 测试方法的基本使用
 * @author liuzhenyuan
 *
 */
public class TestMethod {

	public static void main(String[] args){
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		int c = tm.add(30, 40, 50)+1000; 
		System.out.println(c);
	}
	void printSxt(){
		System.out.println("!");
		System.out.println("!!");
		System.out.println("!!!");
	}
	  int add(int a,int b,int c){
		int sum = a + b + c;
		System.out.println(sum);
		return sum;   //renturn的作用，1、结束方法的运行，2返回值。
	}
}
