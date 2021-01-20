package com.kita.first.level2;

public class Car {
	private int speed;
	private String color;
	//생성시킬때 값을 입력하거나
	
	Car(int speed){
		this.speed = speed;
	}
	Car(String color){
		this.color = color;
	}
	
	//필드에 값을 입력할 수 있음 setter
	void setSpeed(int speed) {
		this.speed = speed;
	}
	//리턴 시켜줌 getter
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}
}
