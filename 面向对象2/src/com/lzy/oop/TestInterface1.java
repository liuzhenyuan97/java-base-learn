package com.lzy.oop;

public class TestInterface1 {

}

interface A{
	void testa();
}

interface B{
	void testb();
}

/*�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A,B{
	void testc();
}

class Mysubclass implements C{

	@Override
	public void testa() {
		
	}

	@Override
	public void testb() {	
		
	}

	@Override
	public void testc() {
		
	}
}