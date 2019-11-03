package com.lzy.mycollection;

/**
 * �Զ���ʵ��һ��ArrayList ���ײ�ԭ��
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
			throw new RuntimeException("��������Ϊ����");
		}else if(capacity==0){
			elementDate = new Object[DEFALT_CAPACITY];
		}else{
			elementDate = new Object[capacity];
		}
	}
	
	
	public void add(E element){
		
		//ʲôʱ�����ݣ�
		if(size == elementDate.length){
			//���ݲ���
			Object[] newArray = new Object[elementDate.length+(elementDate.length>>1)];//10+10/2 >>Ϊ���㣬����
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
		//�����Ϸ��ж�[0,size] [10] 0-9
		if(index<0||index>size-1){
			//���Ϸ�
			throw new RuntimeException("�������Ϸ�:"+index);
	
		}
	}
	
	public void remove(E element){
		//element,����������Ԫ�ذ����Ƚϣ���õ�һ���Ƚ�ֵΪtrue�ģ�����
		for(int i=0;i<size;i++){
			if(element.equals(get(i))){//���������еıȽϲ����������õ�equals������==
				//����Ԫ�شӴ˴��Ƴ�
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
