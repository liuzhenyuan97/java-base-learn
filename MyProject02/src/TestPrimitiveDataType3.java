/**
 * 测试字符类型和boolean类型
 * @author liuzhenyuan
 *
 */
public class TestPrimitiveDataType3 {
       
	public static void main(String[] args){
		char a = 'T';
		char b = '刘';
		char c = '\u0061';
		System.out.println(c);
		
		//转义字符
		System.out.println("输出结果："+'a'+'\n'+'b');
		System.out.println("输出结果："+'a'+'\t'+'b');
		System.out.println("输出结果："+'a'+'\'' +'b');  // a'b   
				
		//String就是字符序列
		String d = "abc";
		
		//测试布尔类型
		boolean man = true;
		
		if(man){    //不推荐man==true  防止对man的重新赋值，= 赋值  ==比较。
			System.out.println("男性");
		}
		
	}
	
	
}
