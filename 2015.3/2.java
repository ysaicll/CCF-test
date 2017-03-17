/*
问题描述

　　给定n个整数，请统计出每个整数出现的次数，按出现次数从多到少的顺序输出。

输入格式

　　输入的第一行包含一个整数n，表示给定数字的个数。
 　　第二行包含n个整数，相邻的整数之间用一个空格分隔，表示所给定的整数。

输出格式

　　输出多行，每行包含两个整数，分别表示一个给定的整数和它出现的次数。按出现次数递减的顺序输出。如果两个整数出现的次数一样多，则先输出值较小的，然后输出值较大的。

样例输入

12
5 2 3 3 1 3 4 2 5 2 3 5

样例输出

 3 4
 2 3
 5 3
 1 1
 4 1

评测用例规模与约定

　　1 ≤ n ≤ 1000，给出的数都是不超过1000的非负整数。
*/
//通过率100%


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int len=scanner.nextInt();
	int num[]=new int[len];
	for(int i=0;i<len;i++)
		num[i]=scanner.nextInt();
	Main io=new Main();
	scanner.close();
	io.count(num);
	
}
   public void count(int[] num)
   {
	  Map<Integer, Integer>map=new HashMap<>();
	  Map<Integer, Integer>map1=new HashMap<>();
	  Set<Integer>set=new HashSet<>();
	  List<Integer>list=new ArrayList<>();
	  for(int i=0;i<num.length;i++)
	  {
		  if(!map.containsKey(num[i]))
			  map.put(num[i], 1);
		  else {
			map.put(num[i], map.get(num[i])+1);
		}
		  set.add(num[i]);
	  }
	  Integer arr1[]=set.toArray(new Integer[0]);
	  int arr2[]=new int[set.size()];
	  int arr3[]=new int[set.size()];//用来确定原数组的顺序
	  for(int i=0;i<arr1.length;i++)
	  {	 
		  arr2[i]=map.get(arr1[i]);
		  map1.put(arr1[i], arr2[i]);
	  }
	  Arrays.sort(arr2);
	  Arrays.sort(arr1);
	  for(int i=arr2.length-1;i>=0;i--)   
	  {
		  for(int j=0;j<arr1.length;j++) //原数组排序之后，保证个数相同的元素数字小的在前面
		  {
		  if(map1.get(arr1[j])==arr2[i])
		  {	
			  if(!list.contains(arr1[j]))//list用来排除个数相同的数组元素用两遍
			  {
			     arr3[i]=arr1[j];
			     list.add(arr1[j]);
			     break;
			  }
			  else 
				continue;		
		  }
		 }
	   }
	  for(int i=arr2.length-1;i>=0;i--)
	  {		  
		  System.out.println(arr3[i]+" "+arr2[i]);
	  }
   }
}
