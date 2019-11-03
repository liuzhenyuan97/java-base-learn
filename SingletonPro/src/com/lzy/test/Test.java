package com.lzy.test;

import com.lzy.singleton.SingletonOne;
import com.lzy.singleton.SingletonTwo;
import java.util.*;

public class Test {
	
	public static void main(String[] args){
		int a = 10;
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);
		for(int i=0 ; i<a  ; i++)
		   System.out.print("====");
		System.out.println();
		SingletonTwo one1 = SingletonTwo.getInstance();
		SingletonTwo two1 = SingletonTwo.getInstance();
		System.out.println(one1);
		System.out.println(two1);
	}

}
