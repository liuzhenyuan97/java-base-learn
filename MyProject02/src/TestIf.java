/**
 * 测试if单选择结构
 * @author liuzhenyuan
 *
 */
public class TestIf {
	
	public static void main(String[] args){
		/*double d = Math.random(); //返回【0,1】之间的随机数
		System.out.println(d);
		System.out.println((int)(6*Math.random()+1));
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if(i<=3){
			System.out.println("小");
		}
		*/
		System.out.println("----------------------");
		//通过掷三次骰子看看今天手气这么样
		int x = (int)(6*Math.random()+1);//通过Math.random()产生随机数
		int y = (int)(6*Math.random()+1);
		int z = (int)(6*Math.random()+1);
        int count = x + y + z;
        //如果三个骰子之和大于15，则手气不错。
		if (count>15){
			System.out.println("手气不错");
		}
		//如果三个骰子在10到15之间，则手气一般
		if (count>=10&&count<=15){
			System.out.println("手气一般");
		}
		//如果三个骰子之和小于10，则手气不怎么样
		if (count<10){
			System.out.println("手气不怎么样");
		}
		
	}

}
