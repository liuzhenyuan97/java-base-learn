package com.lzy.oop;
/**
 * 抽象类的意义在于：为子类提供统一的，规范的模板。子类必须实现相关的抽象方法。
 * @author liuzhenyuan
 *
 */
//1、有抽象方法的类只能定义成抽象类
//2、抽象类不能实例化，即不能用来new来实例抽象化
//3、抽象类可以包含属性，方法，构造方法，但是构造方法不能用new实例，只能被子类调用。
//4、抽象类只能用来被继承
//5、抽象方法必须被子类实现
public abstract class Animal {
	//第一：没有实现，第二：子类必须实现（重写）
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
	   System.out.println("汪汪汪！");	
	}
	
}