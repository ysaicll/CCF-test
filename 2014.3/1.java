/*
问题描述

　　有 N 个非零且各不相同的整数。请你编一个程序求出它们中有多少对相反数(a 和 -a 为一对相反数)。

输入格式

　　第一行包含一个正整数 N。(1 ≤ N ≤ 500)。
 　　第二行为 N 个用单个空格隔开的非零整数,每个数的绝对值不超过1000,保证这些整数各不相同。

输出格式

　　只输出一个整数,即这 N 个数中包含多少对相反数。

样例输入

5
 1 2 3 -1 -2

样例输出
*/
//通过率100%

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public void resorve(int pic[]){
		
		int count=0;
		for(int i=0;i<pic.length-1;i++)
		{
			for(int j=i+1;j<pic.length;j++){
			    if(pic[i]+pic[j]==0)
				   count++;
		       }
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		
		int pic[]=new int[n1];
		for(int i=0;i<n1;i++)
		{			
				pic[i]=scanner.nextInt();
		}
		Main main=new Main();
		main.resorve(pic);
		scanner.close();
        
    }
}

