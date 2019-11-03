package com.lzy.test;

/**
 * 测试StringBuilder、StringBuffer可变字符序列
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<26;i++){
			char temp = (char)('a'+i);
			sb.append(temp);
		}
		System.out.println(sb);
		sb.reverse();//倒序
		System.out.println(sb);
		sb.setCharAt(0, '颉'); //替换
		System.out.println(sb);
		//链式调用。核心就是return this 返回自己。
		sb.insert(2, '我').insert(10, '爱').insert(20, '你');
		System.out.println(sb);
	}
}
