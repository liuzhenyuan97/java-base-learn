package com.lzy.test;

/**
 * ����StringBuilder��StringBuffer�ɱ��ַ�����
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<26;i++){
			char temp = (char)('a'+i);
			sb.append(temp);
		}
		System.out.println(sb);
		sb.reverse();//����
		System.out.println(sb);
		sb.setCharAt(0, '�'); //�滻
		System.out.println(sb);
		//��ʽ���á����ľ���return this �����Լ���
		sb.insert(2, '��').insert(10, '��').insert(20, '��');
		System.out.println(sb);
	}
}
