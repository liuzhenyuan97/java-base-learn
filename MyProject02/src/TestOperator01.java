/**
 * �������������
 * @author liuzhenyuan
 *
 */
public class TestOperator01 {
    
	public static void main(String[] args){
		/*
		byte  a  = 1;
		short b  = 2;
		int   c  = 3;
		long  d  = 4;
		//byte e  = a + b;  //���� Ĭ��Ϊint �ڴ治�㣬����
		//int  c2 = c + d�� //���� long�����Ը�ֵ��int ����
		
		float x  =  1.5f;
		//float y =  x + 1.5;  //����1.5Ĭ����double �޷���ֵ��float��
		*/
		
		/*
		//���������Լ�
		int a = 1;
		int b = ++a;//�������ٸ�ֵ
		System.out.println("a="+a+"\nb="+b);
		a = 1;
		b = a++;//��ֵ������
		System.out.println("a="+a+"\nb="+b);
		*/
		
		int a = 3;
		int b = 4;
		a+=b;//   ==>  a=a+b
		System.out.println("a="+a+"\nb="+b);
		a*=b+3;// ==> a=a*(b+3)
		System.out.println("a="+a+"\nb="+b);//49  a=a+b=4+3=7 a=7 a=a*(b+3)=7*(4+3)
		
	}
	
}
