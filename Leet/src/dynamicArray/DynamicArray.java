package dynamicArray;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
	private T[] arr;
	private int len = 0; //length user thinks array is
	private int capacity = 0; //actual array length
	
	public DynamicArray() {
		this(16);
	}
	
	public DynamicArray(int capacity) {
		if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	public int size() {
		return len;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public void set(int index, T elem) {
		arr[index] = elem;
	}
	
	public void clear() {
		for(int i=0; i<len; i++) arr[i] = null;
		len = 0;
	}
	
	public void add(T elem) {
		//resizing ....
		if(len+1 > capacity) {
			if(len == 0) {capacity = 1;}
			else {capacity *=2;} //doubling the size of the array
		T[] newArr = (T[]) new Object[capacity];
		
		for (int i=0; i<len; i++) {newArr[i] = arr[i];}
		arr = newArr; //set new array to the old one
		}
		arr[len++] = elem;
	}
	
	public T removeAt(int rm_index) {
		if(rm_index >=len || rm_index < 0) throw new IndexOutOfBoundsException();
		T data = arr[rm_index];
		T[] new_arr = (T[]) new Object[len--];
		
		for(int i=0, j=0; i<len; i++, j++) {
			if(i==rm_index) j--; //skip over rm_index by fixing j temporariry.
			else new_arr[j] = arr[i];
		}
		arr = new_arr;
		capacity = --len;
		return data;
	}
	
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
