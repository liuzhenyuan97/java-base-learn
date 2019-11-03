package com.lzy.test;

import java.io.File;
import java.io.IOException;

/**
 * 测试File的基本用法
 * @author liuzhenyuan
 *
 */
public class TsetFile {
	public static void main(String[] args) throws IOException{
		
		//File f = new File("G:/使用说明.txt");
		File f = new File("G:/使用说明.txt");
		System.out.println(f);
		f.renameTo(new File("G:/使用说明2.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		
		File f2 = new File("lzy.txt");
		f2.createNewFile();
		
	}

}
