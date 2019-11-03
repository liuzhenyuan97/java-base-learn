package com.lzy.singleton;
//����ʽ����������ʵ����ʱ��ֱ�ӳ�ʼ��   �ռ任ʱ��
public class SingletonOne {
    //��������˽�й���
	private SingletonOne(){
		
	}
	
	//���������͵�˽�о�̬ʵ��
	private static SingletonOne instance = new SingletonOne();
	
	//�������о�̬�������ؾ�̬ʵ������
	public static  SingletonOne getInstance(){
		return instance;
	}
	
}
