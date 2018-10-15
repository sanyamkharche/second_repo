package com.lambda3;

public class LambdaDemo3y {

	public static void main(String[] args) {
		Hello h = (name)->{   // we can remove this parenthesis also.
			String msg = "Hi mr.";
			return msg + name;
		};
		
		System.out.println(h.greet("Sanyam"));;
	}
}
