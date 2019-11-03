package com.lzy.mycollection;

/**
 * 自动以实现一个ArrayList 体会底层原理
 * @author liuzhenyuan
 *
 */
public class SxtArrayList<E> {
	
	private Object[] elementDate;
	private int size;
	
	private static final int DEFALT_CAPACITY = 10;
	
	
	public SxtArrayList(){
		elementDate = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList(int capacity){
		if(capacity<0){
			throw new RuntimeException("容器不能为负数");
		}else if(capacity==0){
			elementDate = new Object[DEFALT_CAPACITY];
		}else{
			elementDate = new Object[capacity];
		}
	}
	
	
	public void add(E element){
		
		//什么时候扩容？
		if(size == elementDate.length){
			//扩容操作
			Object[] newArray = new Object[elementDate.length+(elementDate.length>>1)];//10+10/2 >>为运算，右移
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
		elementDate[size++] = element;
	}
	
	public E get(int index){
		return (E)elementDate[index];
	}
	
	public void set(E element,int index){
		checkRange(index);
		
		elementDate[index] = element;
	}
	
	public void checkRange(int index){
		//索引合法判断[0,size] [10] 0-9
		if(index<0||index>size-1){
			//不合法
			throw new RuntimeException("索引不合法:"+index);
	
		}
	}
	
	public void remove(E element){
		//element,将和他所有元素挨个比较，获得第一个比较值为true的，返回
		for(int i=0;i<size;i++){
			if(element.equals(get(i))){//容器中所有的比较操作，都是用的equals而不是==
				//将该元素从此处移除
				remove(i);
			}
		}
	}
	
	public void remove(int index){
		//a,b,c,d,e,f,g,h
		//a,b,c,d,e,f,g,h
		int numMoved = elementDate.length-index-1;
		if(numMoved>0){
			System.arraycopy(elementDate, index+1, elementDate, index, numMoved);
		}
		elementDate[--size] = null;
	}
	
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		//[a,b,c]
		sb.append("[");
		for(int i=0;i<size;i++){
			sb.append(elementDate[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		SxtArrayList s1 = new SxtArrayList();
		
		
		for(int i=0;i<400;i++){
			s1.add("liu"+i);
		}
		s1.set("aaa", 20);
		System.out.println(s1);
		System.out.println(s1.get(20));
	}

}
