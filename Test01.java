package com.Nishu;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class Test01 {
	public void check(int n) {
		    if (n>0) {
		    	System.out.println("no is positive");
		    } else if(n<0) {
		    	System.out.println("no is negative");
		    } else {
		    	System.out.println("no is zero");
		    }
	}
	
       public static void main(String[] args) {
    	   Scanner scn = new Scanner(System.in);
    	   System.out.println("Pls enter the no");
    	   
    	   int a= scn.nextInt();
//    	   System.out.println("enter the bredth");
//    	   int b= scn.nextInt();
//    	   Ract r = new Ract();
//		r.setBredth(10);
//		r.setLen(20);
//    	   r.perimeter(a, b);
    	   Test01 t = new Test01();
    	   t.check(a);
    
		
	}
}
