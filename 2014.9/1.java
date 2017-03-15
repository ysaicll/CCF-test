/*
问题描述

　　给定n个不同的整数，问这些数中有多少对整数，它们的值正好相差1。

输入格式

　　输入的第一行包含一个整数n，表示给定整数的个数。
 　　第二行包含所给定的n个整数。

输出格式

　　输出一个整数，表示值正好相差1的数对的个数。

样例输入

6
 10 2 6 3 7 8

样例输出

3

样例说明

　　值正好相差1的数对包括(2, 3), (6, 7), (7, 8)。

评测用例规模与约定

　　1<=n<=1000，给定的整数为不超过10000的非负整数。
*/
//通过率100%

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public void resorve(int pic[]){
		Arrays.sort(pic);
		int count=0;
		for(int i=0;i<pic.length-1;i++)
		{
			if(pic[i]+1==pic[i+1])
				count++;
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

