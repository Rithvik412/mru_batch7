package com.mru.oops;

interface Interface1{
	public void addition();
	
	public int subtraction (int num1,int num2);
	
	public void multiplication (int num1, int num2);
	
	public int division();
}

class Test1 implements Interface1{


public class Demo2 {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.addition();
		
		int res1 = test1.subtraction(100, 50);
		System.out.println("Subtraction..."+res1);
		
		test1.multiplication(100,50);
		
		int res2 = test1.division();
		System.out.println("division....."+res2);

	}

}

@Override
public int subtraction(int num1, int num2) {
	// TODO Auto-generated method stub
	int res = num1 - num2;
	return res;
}

@Override
public void addition() {
	// TODO Auto-generated method stub
	int num1 = 100;
	int num2 = 200;
	int res = num1 + num2;
	System.out.println("Addition..."+res);
	
}


@Override
public int division() {
	int num1 = 100;
	int num2 = 50;
	int res = num1 / num2;
	return res;
}

@Override
public void multiplication(int num1, int num2) {
	// TODO Auto-generated method stub
	int res = num1*num2;
	System.out.println("Multiplication....."+res);
			
}
}


	

