/**
 * ����ѭ������break
 * @author liuzhenyuan
 *
 */
public class TestBreak { 
	public static void main(String[] args){
		int total = 0;//�����������
		System.out.println("Begin");
		while(true){
			total++;//ÿ��ѭ��������1��
			int i = (int)Math.round(100*Math.random());
			System.out.println(i);
			if (i==88){//��iΪ88ʱ���˳�ѭ����
				break;
			}
		}
		//ѭ������Ĵ���
		System.out.println("Game over,used"+total+"times");
	}	
}
