/**
 * ��������ת��
 * @author liuzhenyuan
 *
 */
public class TestOperator07 {
   
	public static void main(String[] args){
		
		int a = 324;
		long b = a;
		double c = b;
		//a = b;  long ���ܸ�ֵ�� int
		//long e = 3.23F;   float ���ܸ�ֵ�� long
		float f = 2345678L;
		
		
		//����
		byte b2 = 123;  //byte short int ����ֱ�Ӹ�ֵ������
		
		double x = 3.99;
		int y = (int) x; //ǿ��ת�� double==>int ������ȥ
		char z = 'a';
		int k = z+1;
		System.out.println(y);
		System.out.println(k);
		System.out.println((char)k);

		
	}
	
}
