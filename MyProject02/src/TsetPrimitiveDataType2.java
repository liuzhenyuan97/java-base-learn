import java.math.*;
/**
 * ���Ը�����
 * @author liuzhenyuan
 *
 */
public class TsetPrimitiveDataType2 {

	public static void main(String[] args) {
		float a = 3.14f;//Ĭ��double�ͣ�8�ֽڣ�float�ĸ��ֽڣ��Ų��£������f����F��
		float b = 6.28F;
		double c = 628E-2;//����628e-2 628E2 
		System.out.println(c);
		
		//�����Ͳ���ȷ���������ڱȽ�
		float f = 0.1f;
		double d = 1/10;
		System.out.println(f==d);  //���Ϊfalse
		
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
