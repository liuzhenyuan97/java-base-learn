package com.lzy.test;

/**
 * ����StringBuilder StringBuffer �ɱ��ַ�����
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder {
	public static void main(String[] args){
		String str;
		
		//StringBuilder �̲߳���ȫЧ���ߡ���һ��ʹ������
		//StringBuffer �̰߳�ȫ��Ч�ʵ͡�
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');//��������ĸ����M
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
	}

}
