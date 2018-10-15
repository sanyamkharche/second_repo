package com.lambda2;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		Sayable s = ()->{
			return "I love you...!!";
		};
		
		System.out.println(s.say());;
	}
}
