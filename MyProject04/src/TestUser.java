/**
 * ���Ծ�̬��ʼ�����ʹ��
 * @author liuzhenyuan
 *
 */
    public class TestUser{
	int id;  //id
	String name;//�û���
	String pwd; //����
	static String company;//��˾����
	
	static{
		System.out.println("ִ����ĳ�ʼ������");
		company = "�ϴ��Ժ";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
	}
	
	public static void main(String[] args){
		TestUser u = null ;
	}
	
}