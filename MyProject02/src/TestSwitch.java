/**
 * ����switch
 * ������ֵ�жϵ�ʱ���Ƽ�ʹ��switch����ȻҲ����ʹ�� if else if else�ṹ
 * @author liuzhenyuan
 *
 */
public class TestSwitch {

	public static void main(String[] args) {
		
		int month = (int)(1+12*Math.random());
		System.out.println("�·ݣ�"+month);
		
		switch(month){
		case 1:
			System.out.println("һ�·ݣ������ˣ�");
			break;
		case 2:
		    System.out.println("���·ݣ����쵽�ˣ�");
		    break;
		default:
			System.out.println("���������·�");
			break;
		}
		
		System.out.println("---------------------");
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2 = (char)(c+rand);
		System.out.println(c2+":");
		
		switch (c2){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ����ĸ");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ����ĸ");
		    break;
		default:
			System.out.println("������ĸ");
		}
		
		
	}
	
}
