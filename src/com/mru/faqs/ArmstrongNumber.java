package com.mru.faqs;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int num=sc.nextInt();
		//store num to original_num to overcome mutability issue
		int original_num=num;
		//step1. read number of digits
		int digits = String.valueOf(num).length();
		double result=0;
		
		while (num!=0) {
			//step2 read last digit
			int last=num%10;
			//step3 do the last power of digits
			result = result+Math.pow( last, digits);
			//delete lasst
			num = num/10;
			
		}
		if(original_num == result)
			System.out.println("ArmstrongNumber!!");
		else
			System.out.println("NotArmstrongNumber!!");
			

	}

}
