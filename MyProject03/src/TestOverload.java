/**
 * ���Է�������
 * @author liuzhenyuan
 *
 */
public class TestOverload {

	public static void main(String[] args){
		System.out.println(add(3,5));//8
		System.out.println(add(3,5,7));//15
		System.out.println(add(3.5,5));//8.5
		System.out.println(add(3,5.5));//8.5



	}
	//��͵ķ���
	public static int add(int a,int b){
		int sum = a + b;
		return sum;
	}
	/*  //ֻ�з���ֵ��ͬ������������
	public static double add(int a,int b){
		double sum = a + b;
		return sum;
	}
	
	*/
	  //ֻ�в������Ʋ�ͬ������������
	/*
	public static int add(int b,int a){
		int sum = a + b;
		return sum;
	}
	*/
	
	//��������ͬ������������ͬ����������
	public static int add(int a,int b,int c){
		int sum = a + b + c;
		return sum;
	}
	//��������ͬ���������Ͳ�ͬ����������
	public static double add(double a,int b){
		double sum = a + b;
		return sum;
	}
	//��������ͬ������˳��ͬ���������ء�
	public static double add(int a,double b){
		double sum = a + b;
		return sum;
	}

}
