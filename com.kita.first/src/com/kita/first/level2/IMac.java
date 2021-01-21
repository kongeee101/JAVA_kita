package com.kita.first.level2;

public class IMac {
	private int memory;
	private String color;
	
	public IMac(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}
	
	public void setIMemory(int memory) {
		this.memory = memory;
	}
	public void setIColor(String color) {
		this.color = color;
	}
	public int getIMemory() {
		return memory;
	}
	public String getIColor() {
		return color;
	}
}
