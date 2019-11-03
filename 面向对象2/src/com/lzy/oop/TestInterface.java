package com.lzy.oop;

/**
 * ���Խӿں�ʵ����
 * @author liuzhenyuan
 *
 */
public class TestInterface {
	public static void main(String[] args){
		Volant v = new Angel();
		v.fly();
		//v.helpOther; ֻ�Ͻӿ�
		
		Honest h = new GoodMan();
		h.helpOther();
		
	}
}

/**
 * ���нӿ�
 * @author liuzhenyuan
 * 
 */
interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
}

//�����ӿ�
interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{//ʵ�������ʵ�ֶ�����ӿڡ�
	@Override
	public void helpOther(){
		System.out.println("Angel.fly()");
	}
	
	@Override
	public void fly(){
		System.out.println("Angel.fly()");
	}
}

class GoodMan implements Honest{
	@Override
	public void helpOther(){
		
	}
}

class BridMan implements Volant{
	@Override
	public void fly(){
		
	}
}