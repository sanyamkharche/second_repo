package com.snk.selection;

public class IfElse {
public static void main(String[] args) {
	boolean b = true;
	if(b==true)	//if-else--- else and {} are optional. but without {}, only single statement is allowed which should not be
					// declarative. 'if' argument should be boolean
	System.out.println("hi");
	if(b==false)
		System.out.println("hello");
	else
		System.out.println("by");	//no dangling else problem in java. every else is matched with nearest 'if' statement
	
}
}
