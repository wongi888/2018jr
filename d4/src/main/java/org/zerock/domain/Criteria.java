package org.zerock.domain;

public class Criteria {

	private int page;
	
	public Criteria() {
		this.page = 1;
	}
	
	public Criteria(int page) {
		this.page = page;
	}
	
	public int getSkip() {
		System.out.println("get skip..........");
		System.out.println("get skip..........");
		System.out.println("get skip..........");
		System.out.println("--------------------------");
		
		return (this.page -1 ) * 10; 
	}
	
}
