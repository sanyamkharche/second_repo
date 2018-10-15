package com.snk.iterative;

public class LablledBreakContinue {
public static void main(String[] args) {
	l1:
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					break; // use (break l1), (continue) and (continue l1) and see the different output
				System.out.println(i+".."+j);
			}
		}
}
}
