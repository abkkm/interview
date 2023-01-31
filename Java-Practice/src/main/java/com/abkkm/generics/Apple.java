package com.abkkm.generics;
class Apple extends Fruit{
	
	public Apple() {
		super();
	}
	
	public Apple(String size) {
		super();
		this.size = size;
	}

	private String size ;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}