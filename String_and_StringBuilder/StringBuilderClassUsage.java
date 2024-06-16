package Strings_StringBuilders_StringTokenizers;

import java.lang.reflect.Array;
import java.util.*;   //Imports the whole package.

//import java.util.Arrays;

public class StringBuilderClassUsage {

	public static void main(String[] args) {
		StringBuilder st1=new StringBuilder("Ahsan");
		
		StringBuilder st2=new StringBuilder(" Ali");
//		st1.append(st2);
		
		System.out.println(st1.append(st2));
		
		int [] array=new int[5];
		array[0]=4;array[1]=7;array[2]=0;
		array[3]=6;array[4]=8;
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		
	}

}
