/**
 * ����if else˫ѡ��ṹ
 * @author liuzhenyuan
 *
 */

public class TestIfElse {

	public static void main(String[] args){
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if (h<=3){
			System.out.println("С");
		}else{
			System.out.println("��");
		}
		
		System.out.println("---------------------");
		//�������һ����0.0,4.0������İ뾶�������ݰ뾶��Բ��������ܳ�
		double r = 4*Math.random();
		//Math.pow(r,2)��뾶��ƽ��
		double area = Math.PI*Math.pow(r, 2);
		double circle = 2*Math.PI*r;
		System.out.println("�뾶�ǣ�"+r);
		System.out.println("�ܳ��ǣ�"+circle);
		System.out.println("����ǣ�"+area);
		if (area>=circle){
			System.out.println("������ڵ����ܳ�");
		}else{
			System.out.println("�ܳ��������");

		}

		
	}
	
}
