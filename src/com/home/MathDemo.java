package com.home;

public class MathDemo {
	public int add(int x, int y){
		return x+y;
	}
	public int sub(int x, int y){
		return x-y;
	}
	public int multiplication(int x,int y){
		return x*y;
	}
	public int div( int x, int y){
		if(y!=0)
			return x/y;
		else
			return -1;
	}
}