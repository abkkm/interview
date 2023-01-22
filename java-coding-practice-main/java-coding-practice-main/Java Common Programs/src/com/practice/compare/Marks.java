package com.practice.compare;

public class Marks {
	
	private int science;
	
	private int math;
	
	private int social;
	
	private int language1;
	
	private int language2;
	
	private int total;
	
	public Marks(int science,int math,int social,int language1, int language2) {
		this.science = science;
		this.math = math;
		this.social = social;
		this.language1 = language1;
		this.language2 = language2;
		this.setTotal();
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getLanguage1() {
		return language1;
	}

	public void setLanguage1(int language1) {
		this.language1 = language1;
	}

	public int getLanguage2() {
		return language2;
	}

	public void setLanguage2(int language2) {
		this.language2 = language2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.science + this.math + this.social + this.language1 + this.language2;
	}
	
	
}
