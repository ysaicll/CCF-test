/*
问题描述

　　给定n个正整数，找出它们中出现次数最多的数。如果这样的数有多个，请输出其中最小的一个。

输入格式

　　输入的第一行只有一个正整数n(1 ≤ n ≤ 1000)，表示数字的个数。
 　　输入的第二行有n个整数s1, s2, …, sn (1 ≤ si ≤ 10000, 1 ≤ i ≤ n)。相邻的数用空格分隔。

输出格式

　　输出这n个次数中出现次数最多的数。如果这样的数有多个，输出其中最小的一个。

样例输入

6
 10 1 10 20 30 20

样例输出

10
*/
//通过率50%

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public void resorve(int pic[]){	
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();	
		for(int i=0;i<pic.length;i++)
		{
			if(!map.containsKey(pic[i]))
				map.put(pic[i], 1);
			else
			    map.put(pic[i], map.get(pic[i])+1);
		}
		Arrays.sort(pic);
		int min=pic[0];
		for(int i=0;i<pic.length-1;i++)
		{
			if(map.get(pic[i])<map.get(pic[i+1]))
				min=pic[i+1];		
		}
			System.out.println(min);
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

