/**
 * ���Է����Ļ���ʹ��
 * @author liuzhenyuan
 *
 */
public class TestMethod {

	public static void main(String[] args){
		//ͨ�����������ͨ����
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
		return sum;   //renturn�����ã�1���������������У�2����ֵ��
	}
}
