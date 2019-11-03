/**
 *
 * 测试参数传值机制
 * @author liuzhenyuan
 *
 */
public class User1 {

	int id; //id
	String name; //账户名
	String pwd; //密码
	
	public User1(int id,String name){
		this.id = id;
		this.name = name; 
	}
	
	public void testParameterTransfer01(User1 u){
		u.name = "高1";
	}
	
	public void testParameterTransfer02(User1 u){
		u = new User1(100,"高三");
	}
	
	public static void main(String[] args){
		User1 u1 = new User1(200,"高二");
		
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
	}
	
}
