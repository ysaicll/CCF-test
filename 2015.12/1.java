/*
问题描述
　　给定一个十进制整数n，输出n的各位数字之和。
输入格式
　　输入一个整数n。
输出格式
　　输出一个整数，表示答案。
样例输入
20151220
样例输出
13
样例说明
　　20151220的各位数字之和为2+0+1+5+1+2+2+0=13。
评测用例规模与约定
　　所有评测用例满足：0 ≤ n ≤ 1000000000。
*/
//通过率100%


import java.util.Arrays;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INEG;

public class Main {
public int max(long n){
	int sum=0;
	String len=Long.toString(n);
	for(int i=0;i<len.length();i++)
	{
		sum=sum+Integer.parseInt(len.charAt(i)+"");
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        scanner.close();
        Main main=new Main();      
        System.out.println(main.max(n));      
    }
}