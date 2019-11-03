package reflection;

import java.util.*;
import java.lang.reflect.*;;

/**
 * 这程序使用映射打印类的所有功能
 * @author liuzhenyuan
 *
 */

public class ReflectionTest {

	public static void main(String[] args){
		//从命令行参数或用户输入读取类名
		String name;
		if(args.length>0)
			name = args[0];
		else{
			Scanner in = new Scanner(System.in);
			System.out.println("输入类名(e.g.java.util.Date):");
			name = in.next();
		}
	
	
	try {
		//打印类名和superclass name (if!=Object)
		Class cl = Class.forName(name);
		Class supercl = cl.getSuperclass();
		String modifiers = Modifier.toString(cl.getModifiers());
		if(modifiers.length()>0)
			System.out.print(modifiers +  " ");
		System.out.print("class" + name);
		if(supercl != null && supercl != Object.class)
			System.out.print(" extends " + supercl.getName());
		
		System.out.print("\n{\n");
		printConstructors(cl);
		System.out.println();
		printMethods(cl);
		System.out.println();
		printFields(cl);
		System.out.println("}");		
	}
	
	catch (ClassNotFoundException e){
		e.printStackTrace();
	}
	
	System.exit(0);	
	
    }

/**
 * 打印类的所有构造函数
 * @param cl a class
 */
	public static void printConstructors(Class cl){
		Constructor [] constructors = cl.getDeclaredConstructors();
		
		for(Constructor c : constructors){
			String name = c.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length()>0)
				System.out.print(modifiers + " ");
			System.out.print(name + "(");
		
		//打印参数类型
		Class[] paramTypes = c.getParameterTypes();
		for (int j = 0; j<paramTypes.length; j++){
			if(j>0)
				System.out.print(", ");
			System.out.print(paramTypes[j].getName());
	   }
		System.out.println(");");
	  }
	}
	
	/**
	 * 打印所有方法的类
	 * @param cl a class
	 */
	public static void printMethods(Class cl){
		Method[] methods = cl.getDeclaredMethods();
		
		for(Method m : methods){
			Class retType = m.getReturnType();
			String name = m.getName();
			
			System.out.print("   ");
			//打印修饰语，返回类型和方法名
			String modifiers = Modifier.toString(m.getModifiers());
			if(modifiers.length()>0)
				System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			//打印参数类型
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length;j++){
				if(j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * 打印所有类的领域
	 * @param cl a class
	 */
	public static void printFields(Class cl){
		Field[] fields = cl.getDeclaredFields();
		
		for (Field f : fields){
			Class type = f.getType();
			String name = f.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " +name + ";");
		}
	}
}

