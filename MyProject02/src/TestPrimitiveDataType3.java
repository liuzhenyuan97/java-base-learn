/**
 * �����ַ����ͺ�boolean����
 * @author liuzhenyuan
 *
 */
public class TestPrimitiveDataType3 {
       
	public static void main(String[] args){
		char a = 'T';
		char b = '��';
		char c = '\u0061';
		System.out.println(c);
		
		//ת���ַ�
		System.out.println("��������"+'a'+'\n'+'b');
		System.out.println("��������"+'a'+'\t'+'b');
		System.out.println("��������"+'a'+'\'' +'b');  // a'b   
				
		//String�����ַ�����
		String d = "abc";
		
		//���Բ�������
		boolean man = true;
		
		if(man){    //���Ƽ�man==true  ��ֹ��man�����¸�ֵ��= ��ֵ  ==�Ƚϡ�
			System.out.println("����");
		}
		
	}
	
	
}
