package com.mru.faqs;
import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a Number: ");
		int n = sc.nextInt();
		int[] fib = new int[n];
		
		fib[0]=0;
		fib[1]=1;
		
		System.out.println(fib[0]+" "+fib[1]+" ");
		for(int i=2;i<n;i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int element:fib) {
			System.out.println(element+" ");
		}

	}

}
