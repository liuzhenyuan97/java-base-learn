package com.lzy.test;

import java.io.File;
import java.io.IOException;

/**
 * ����File�Ļ����÷�
 * @author liuzhenyuan
 *
 */
public class TsetFile {
	public static void main(String[] args) throws IOException{
		
		//File f = new File("G:/ʹ��˵��.txt");
		File f = new File("G:/ʹ��˵��.txt");
		System.out.println(f);
		f.renameTo(new File("G:/ʹ��˵��2.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		
		File f2 = new File("lzy.txt");
		f2.createNewFile();
		
	}

}
