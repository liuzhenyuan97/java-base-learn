/**
 * 带标签的Break和Continue
 * @author liuzhenyuan
 *
 */
public class TestLocalContinue {

    public static void main(String[] args){
    	//打印100-150之间的所有指数。只能被被自己和1整除。
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
