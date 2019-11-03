package com.lzy.test;

/**
 * ���Կɱ��ַ����кͲ��ɱ��ַ�����ʹ�õ��ݽ�
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder3 {
	public static void main(String[] args){
		
		/*ʹ��String�ַ���ƴ��*/
		String sb = "";
		long time1 = System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		long num1 = Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<5000;i++){
			sb = sb+1; //�൱�ڲ�����10000������
		}
		long time2 = System.currentTimeMillis();
		long num2 = Runtime.getRuntime().freeMemory();
		System.out.println("Stringռ���ڴ棺"+(num1-num2));
		System.out.println("Stringռ��ʱ�䣺"+(time2-time1));
		
		StringBuilder sb2 = new StringBuilder("");
		long time3 = System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		long num3 = Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
			for(int i=0;i<5000;i++){
				sb2.append(i);
			}
		long time4 = System.currentTimeMillis();
		long num4 = Runtime.getRuntime().freeMemory();
		System.out.println("Stringռ���ڴ棺"+(num3-num4));
		System.out.println("Stringռ��ʱ�䣺"+(time4-time3));
		
	}

}
