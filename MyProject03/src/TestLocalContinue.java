/**
 * ����ǩ��Break��Continue
 * @author liuzhenyuan
 *
 */
public class TestLocalContinue {

    public static void main(String[] args){
    	//��ӡ100-150֮�������ָ����ֻ�ܱ����Լ���1������
    	outer:for(int i=101;i<150;i++){
    		for(int j=2;j<i;j++){
    			if(i%j==0){
    			   continue outer;	
    			}
    		}
    		 System.out.println(i);
    	} 
    }
}
