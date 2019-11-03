package com.lzy.singleton;
//����ʽ������ʵ�����󴴽�ʱ����ֱ�ӳ�ʼ����֪����һ�ε���get����ʱ������ɳ�ʼ������
//ʱ�任�ռ�
public class SingletonTwo {
    //����˽�з�������
	private SingletonTwo(){
		
	}
	
	//������̬�ĸ���ʵ������
	private static SingletonTwo instance = null;
	
	//�������ŵľ�̬�����ṩʵ������
	public static SingletonTwo getInstance(){
		if(instance == null)
			instance = new SingletonTwo();
		
		return instance;
	}
}
