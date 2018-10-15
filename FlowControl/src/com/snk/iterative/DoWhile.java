package com.snk.iterative;

public class DoWhile {  //if we want to represent loop body at least once then go for do-while
	/*do
	 * {
	 * body
	 * }
	 * 	while/(should be boolean);--- ; is mandatory
	 */
public static void main(String[] args) {
	final int a=10,b=20;
	do
	{
		System.out.println("hi");
	}
	while(a>b);
		System.out.println("hello");
}
}

/* between do-whie, we can take any logic
 * unreachable problem is there in do-while loop
 */
