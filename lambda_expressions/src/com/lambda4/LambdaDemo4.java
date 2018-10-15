package com.lambda4;

public class LambdaDemo4 {

	public static void main(String[] args) {
		// Lambda expression without return keyword.  
        Addition ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addition ad2=(int a,int b)->{    // we can mention data type of argument also, like in this case.
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
	}
}
