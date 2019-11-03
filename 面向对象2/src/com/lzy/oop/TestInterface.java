package com.lzy.oop;

/**
 * 测试接口和实现类
 * @author liuzhenyuan
 *
 */
public class TestInterface {
	public static void main(String[] args){
		Volant v = new Angel();
		v.fly();
		//v.helpOther; 只认接口
		
		Honest h = new GoodMan();
		h.helpOther();
		
	}
}

/**
 * 飞行接口
 * @author liuzhenyuan
 * 
 */
interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
}

//善良接口
interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{//实现类可以实现多个父接口。
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