package Package01;
import java.util.*;
/**
 * 测试input 输入
 * @author liuzhenyuan
 *
 */
public class InputTest {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");//输入名字
		String name = in.nextLine();
		
		System.out.println("How old are you?");//输入年龄
		int age = in.nextInt();
		
		System.out.println("Hello,"+name+"Next year,you'll be"+(age+1));//输出
	}
	
}
