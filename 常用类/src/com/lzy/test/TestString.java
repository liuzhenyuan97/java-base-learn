package com.lzy.test;

/**
 * ����String ���ɱ��ַ�
 * @author liuzhenyuan
 *
 */
public class TestString {
	public static void main(String[] args){
		String str = "aaabbbb";
		String str0 = str.substring(2,5);//����char���飬�±��0��ʼ
		
		System.out.println(str);
		System.out.println(str0);
		
		//�Ƚ��ַ�����equals����
		String str1 = "hello"+"java";//�൱��str1 = "hello java";
		String str2 = "hellojava";
		System.out.println(str1==str2);//true
		String str3 = "hello";
		String str4 = "java";
		String str5 = str3+str4;
		System.out.println(str2==str5);//false
		System.out.println(str2.equals(str5));//true
		
	}

}
