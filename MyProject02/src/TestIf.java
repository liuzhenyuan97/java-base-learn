/**
 * ����if��ѡ��ṹ
 * @author liuzhenyuan
 *
 */
public class TestIf {
	
	public static void main(String[] args){
		/*double d = Math.random(); //���ء�0,1��֮��������
		System.out.println(d);
		System.out.println((int)(6*Math.random()+1));
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if(i<=3){
			System.out.println("С");
		}
		*/
		System.out.println("----------------------");
		//ͨ�����������ӿ�������������ô��
		int x = (int)(6*Math.random()+1);//ͨ��Math.random()���������
		int y = (int)(6*Math.random()+1);
		int z = (int)(6*Math.random()+1);
        int count = x + y + z;
        //�����������֮�ʹ���15������������
		if (count>15){
			System.out.println("��������");
		}
		//�������������10��15֮�䣬������һ��
		if (count>=10&&count<=15){
			System.out.println("����һ��");
		}
		//�����������֮��С��10������������ô��
		if (count<10){
			System.out.println("��������ô��");
		}
		
	}

}
