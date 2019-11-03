package com.lzy.mycollection;

/**
 * 自定义一个链表
 * @author liuzhenyuan
 *
 */

public class SxtLinkedList {
	
	private Node first;
	private Node last;
	
	private int size;
	
	
	
	public Object get(int index){
		
		if(index<0||index>size-1){
			throw new RuntimeException("索引不合法");
		}
		
		Node temp = first;
		
		if(index<(size>>1)){//相当于除以2 右移一位
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}else{
			temp = last;
			for(int i=size-1;i>index;i--){
				temp = temp.previous;
			}
		}
		
		return temp.element;
	}
	
	
	
	
	
	
	
	//[]
	//["a"]
	public void add(Object obj){
		Node node = new Node(obj);
		
		if(first==null){
			//node.previous = null;
			//node.privious = null;
			first = node;
			last  = node;
		}else{
			
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
			
		}	
		size++;
	}
	
	
	@Override
	public String toString(){
		//[a,b,c] first = a, last = c
		//a,b,c
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while(temp!=null){
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
	
	public static void main(String[] args){
		SxtLinkedList list = new SxtLinkedList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list.get(5));
		
	}
	

}
