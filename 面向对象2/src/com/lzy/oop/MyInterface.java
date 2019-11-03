package com.lzy.oop;

/**
 * 测试接口
 * @author liuzhenyuan
 *
 */
//1、普通类：具体实现。
//2、抽象类：具体实现，规范（抽象方法）
//3、接口：规范！




public interface MyInterface {
	/*默认public static final*/int maxAge = 100;
	/*默认 public abstract*/void test01();
}

class MyClass implements MyInterface{
	@Override
	public void test01(){
		
	}
}
