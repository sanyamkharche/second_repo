package com.snk.iterative;

public class ForEach {  //(enhanced for loop.From 1.5 version onward
public static void main(String[] args) {
	int[][][] x = {{{1,2},{3}},{{4},{5,6},{7,8,9}}};
	for(int[][]x1:x)
	{
		for(int[] x2:x1)
		{
			for(int x3:x2)
			{
				System.out.println(x3);
			}
		}
	}
}
}
/*best choice if we want to retrieve the elements of array or collection
 * but not suitable for general purpose use
 * we can print array element only in original order but not in reverse order*/
