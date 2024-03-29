package enums;

import java.util.*;

/**
 *这程序说明枚举类型 
 * @author liuzhenyuan
 *
 */

public class EnumTest {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("输入一型号：(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Size=" + size);
		System.out.println("abbreviation=" + size.getAbbreviation());
		if (size == Size.EXTRA_LARGE)
			System.out.println("Good job--you paid attention to the _.");
	}
	
}
	enum Size{
		
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
		
	private String abbreviation;
	
	private Size(String abbreviation){
		this.abbreviation = abbreviation;
	}	
	
	public String getAbbreviation(){
		return abbreviation;
	}
	
}

