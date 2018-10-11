package com.nci.example;

public interface LinearList {

	public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void setCurrent(int index);
	public void remove(int index);
	public void add(int index, Object theElement);
	public String printList();
	public String printBackwardList();

}
