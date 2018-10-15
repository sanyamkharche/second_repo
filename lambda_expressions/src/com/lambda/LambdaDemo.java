package com.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		int width = 10;
		
		/*//without lambda expressions
		Drawable d = new Drawable(){
			public void draw() {System.out.println("Drawing " + width);}
		};*/
		
		//with lambda expressions
		Drawable d = ()->{System.out.println("Drawing " + width);};
		d.draw();
	}
}
