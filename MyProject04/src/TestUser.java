/**
 * 测试静态初始化块的使用
 * @author liuzhenyuan
 *
 */
    public class TestUser{
	int id;  //id
	String name;//用户名
	String pwd; //密码
	static String company;//公司名称
	
	static{
		System.out.println("执行类的初始化工作");
		company = "南大科院";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
	}
	
	public static void main(String[] args){
		TestUser u = null ;
	}
	
}