package com.snk.iterative;

public class While {   // if we dont know no of iterations in advance then go for while() loop
public static void main(String[] args) {
	int a=10, b=20;
	while(a<b)
	{
		System.out.println("hi");
	}
	System.out.println("hello");
}
}
/* while argument should be boolean only
*in above program, if 'a' and 'b' are final then there is an unrechable problem
* {} are optional but withour {}, only one statement is allowed under while which should not be a declarative one
*/