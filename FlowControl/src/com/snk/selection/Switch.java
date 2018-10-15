package com.snk.selection;

public class Switch {   //if several options are available then go for switch instead of if-else
public static void main(String[] args) {
	int x = 10;
	final int y = 20;
	switch(y)   // case label should be a constant one
	{
	case 10:
		System.out.println("hi");
		break;  //to avoid fall through inside switch
	case y:
		if(x>11)
		{
			System.out.println("present");
		}
			System.out.println("absent");
		break;
	default:
		System.out.println("sam");	
	}
}
}



/* {} are mandatory
 * switch arg can be expresstion
 * case label should be a constant value
 * case label value should be in range of switch arg type
 * default case is mandatory but can be allowed only once
 */
