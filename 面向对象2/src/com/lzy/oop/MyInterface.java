package com.lzy.oop;

/**
 * ���Խӿ�
 * @author liuzhenyuan
 *
 */
//1����ͨ�ࣺ����ʵ�֡�
//2�������ࣺ����ʵ�֣��淶�����󷽷���
//3���ӿڣ��淶��




public interface MyInterface {
	/*Ĭ��public static final*/int maxAge = 100;
	/*Ĭ�� public abstract*/void test01();
}

class MyClass implements MyInterface{
	@Override
	public void test01(){
		
	}
}
