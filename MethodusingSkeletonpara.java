package com.dev;

public class MethodusingSkeletonpara {
	public int added(int x,int y)
	{
		int add=x+y;
			return add;
	}
	public static void main(String[] args)
	{
		int num=1,num1=1;
		MethodusingSkeletonpara scan=new MethodusingSkeletonpara();
		int out=scan.added(num, num1);
		System.out.println(out);
		
	}
}
