/**
 * 测试嵌套循环
 * @author liuzhenyuan
 *
 */
public class TestWhlieQianTao {
	public static void main(String[] args){		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){				
				System.out.print(i+"  ");
			}			
			System.out.println();			
		}	
		System.out.println("------------------------");
		for (int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+x*y+"  ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		int sum01 = 0;
		int sum02 = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum02+=i;
			}else{
				sum01+=i;
			}
		}
		System.out.println("奇数和："+sum02);
		System.out.println("偶数和："+sum01);
		int f = 1;
		while(f<=1000){
			if(f%5==0){
				System.out.print(f+"\t");	
			}
			if (f%25==0){
				System.out.println();
			}
			f++;
		}

	}	
}
