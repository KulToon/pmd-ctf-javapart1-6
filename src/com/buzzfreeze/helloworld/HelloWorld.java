package com.buzzfreeze.helloworld;

public class HelloWorld {
	public static void main(String [] args) {
		int i = 0;
		int sum = 0;
		
		while (i <= 10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		
		System.out.println("sum = " + sum);
		//2
		i = 0;
		while (i <= 100) {
			if((i % 12) == 0) {
				System.out.println(i + " / 12 = 0");
			}
			i++;
		}
		//3 lab 6
		int numbers[] = {1, 2, 3 , 4, 5} ;
		for(int n : numbers) {
			System.out.println(n);
		}
		
		// 1 Lab7
		
		for(int count = 20; count >= 0; count --) {
			System.out.println(count);
		}
		
		// 2 Lab7
		boolean a = true;
		int n = 19;
		do {
			if((n % 2) != 0) {
				break;
			}else {
				continue;
			}
			
		}while(a == true);
		
		
		// Lab 8 For
		
		for(int count = 0; count <= 20; count++) {
			
			if(count == 11) {
				System.out.println(count);
				break;
			}
		
		}
		
		
		
		
		
	}
	
}
