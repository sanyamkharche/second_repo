package com.snk.iterative;

public class For {  //if we know no of iterations in advance then go for 'for' loop
public static void main(String[] args) {
	/*for(int i=10, j=20;i<j;i++)
	{
		System.out.println("hi");
	}*/
	int[] x = {1,2,3,4};  //to print array element in reverse order
	for(int i=x.length-1; i>=0; i--)
	{
		System.out.println(x[i]);
	}
}
}
