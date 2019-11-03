import java.math.*;
/**
 * 测试浮点型
 * @author liuzhenyuan
 *
 */
public class TsetPrimitiveDataType2 {

	public static void main(String[] args) {
		float a = 3.14f;//默认double型，8字节，float四个字节，放不下，后面加f或者F。
		float b = 6.28F;
		double c = 628E-2;//或者628e-2 628E2 
		System.out.println(c);
		
		//浮点型不精确，不能用于比较
		float f = 0.1f;
		double d = 1/10;
		System.out.println(f==d);  //结果为false
		
		System.out.println("--------------------");
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);//0.5
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001
        
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
        
        System.out.println(bd2.equals(bd3));

		
	}
	
}
