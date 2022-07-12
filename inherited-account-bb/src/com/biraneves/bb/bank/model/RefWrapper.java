package com.biraneves.bb.bank.model;

public class RefWrapper {
	
	private Object[] refs;
	private int free;
	
	public RefWrapper() {
		
		this.refs = new Object[10];
		free = 0;
		
	}
	
	public void add(Object ref) {
		
		this.refs[this.free] = ref;
		this.free++;
		
	}
	
	public int getNumberOfElements() {
		
		return this.free;
		
	}
	
	public Object getRef(int pos) {
		
		return this.refs[pos];
		
	}

}
