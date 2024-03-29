package com.lzy.oop;

/**
 * 测试非静态内部类
 * @author liuzhenyuan
 *
 */

public class TestInnerClass {
	public static void main(String[] args){
		
		//创建内部类对象
		Outer.Inner inner = new Outer().new Inner();
		
		inner.show();

	}

}

class Outer{
	private int age = 10;
	
	public void testOuter(){
		System.out.print("Outer.testOuter()");
	}
		
	class Inner{
		int age = 20;
		public void show(){
			int age = 30;
			System.out.println("外部类成员变量age:"+Outer.this.age);
			System.out.println("内部类的成员变量age："+this.age);
			System.out.println("内部类的成员变量age："+age);
		}
	}
	
}
