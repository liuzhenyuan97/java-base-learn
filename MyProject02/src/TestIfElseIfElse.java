/**
 * ����if else if else�ṹ
 * @author liuzhenyuan
 *
 */
public class TestIfElseIfElse {

	public static void main(String[] args) {
		
		int age = (int)(100*Math.random());
		System.out.println("������"+age+",����");
		if (age<15){
			System.out.println("��ͯ��ϲ����");
		}else if (age<25) {
			System.out.println("���꣬Ҫ����");
		}else if (age<35) {
			System.out.println("���꣬Ҫ����");
		}else if (age<45) {
			System.out.println("�����꣬Ҫ����");
		}else if (age<65) {
			System.out.println("���꣬ע������");
		}else{
			System.out.println("�����ǣ�������");
		}
		
	}
	
}
