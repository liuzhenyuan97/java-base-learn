package com.lzy.test;

/**
 * �����Զ�װ�䣬����
 * @author liuzhenyuan
 *
 */
public class TestAutoBox {
	public static void main(String[] args){
		Integer a = 234;//�Զ�װ�䣺Integer a = Integer.valuaOf(234);
		int b = a;      //�Զ����䣺int b = a.intValue();
		
		Integer c = null;
		if(c!=null){
		int d = c;
		}                //�Զ����䣺�����ˣ�c.intValue
		
		
		//����[-128,127]֮������֡�ʵ�ʾ���ϵͳ��ʼ��ʱ�򣬴�����[-128,127]
		//���ҵ���ValueOf()��ʱ��ֱ���������Χ֮�������á�
		Integer in1 = Integer.valueOf(-128);
		Integer in2 = -128;
		System.out.print(in1==in2);//true ��Ϊ�ڴ�-128�ڻ��淶Χ��
		System.out.println(in1.equals(in2));//true
		System.out.println("######################");
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.print(in3==in4);//false
		System.out.println(in3.equals(in4));//true
	}

}
