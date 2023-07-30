package com.cg.daythree;
import java.util.Scanner;
public class Limitresult{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start value:");
	int a=sc.nextInt();
	Scanner ac=new Scanner(System.in);
	System.out.println("Enter end value:");
	int b=ac.nextInt();
	Scanner ec=new Scanner(System.in);
	System.out.println("Enter sum number:");
	int c=ec.nextInt();
	int i,digit=0;
	    for(i=a;i<=b;i++){
	        digit=(i%10)+((i/10)%10)+(i/100);
        if(digit==c){
            System.out.println("Results are:"+i);
        }
	}
	}
}