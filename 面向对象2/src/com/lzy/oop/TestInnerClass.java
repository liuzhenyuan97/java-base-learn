package com.lzy.oop;

/**
 * ���ԷǾ�̬�ڲ���
 * @author liuzhenyuan
 *
 */

public class TestInnerClass {
	public static void main(String[] args){
		
		//�����ڲ������
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
			System.out.println("�ⲿ���Ա����age:"+Outer.this.age);
			System.out.println("�ڲ���ĳ�Ա����age��"+this.age);
			System.out.println("�ڲ���ĳ�Ա����age��"+age);
		}
	}
	
}
