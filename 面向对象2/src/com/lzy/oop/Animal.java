package com.lzy.oop;
/**
 * ��������������ڣ�Ϊ�����ṩͳһ�ģ��淶��ģ�塣�������ʵ����صĳ��󷽷���
 * @author liuzhenyuan
 *
 */
//1���г��󷽷�����ֻ�ܶ���ɳ�����
//2�������಻��ʵ����������������new��ʵ������
//3����������԰������ԣ����������췽�������ǹ��췽��������newʵ����ֻ�ܱ�������á�
//4��������ֻ���������̳�
//5�����󷽷����뱻����ʵ��
public abstract class Animal {
	//��һ��û��ʵ�֣��ڶ����������ʵ�֣���д��
	abstract public void shout();
	
	public void run(){
		System.out.println("RUN!");
	}
	
	public static void main(String[] args){
		Animal a = new Dog();
	}
	
}



class Dog extends Animal{
	
	@Override
	public void shout(){
	   System.out.println("��������");	
	}
	
}