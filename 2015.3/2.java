/*
��������

��������n����������ͳ�Ƴ�ÿ���������ֵĴ����������ִ����Ӷൽ�ٵ�˳�������

�����ʽ

��������ĵ�һ�а���һ������n����ʾ�������ֵĸ�����
 �����ڶ��а���n�����������ڵ�����֮����һ���ո�ָ�����ʾ��������������

�����ʽ

����������У�ÿ�а��������������ֱ��ʾһ�������������������ֵĴ����������ִ����ݼ���˳���������������������ֵĴ���һ���࣬�������ֵ��С�ģ�Ȼ�����ֵ�ϴ�ġ�

��������

12
5 2 3 3 1 3 4 2 5 2 3 5

�������

 3 4
 2 3
 5 3
 1 1
 4 1

����������ģ��Լ��

����1 �� n �� 1000�������������ǲ�����1000�ķǸ�������
*/
//ͨ����100%


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
	  int arr3[]=new int[set.size()];//����ȷ��ԭ�����˳��
	  for(int i=0;i<arr1.length;i++)
	  {	 
		  arr2[i]=map.get(arr1[i]);
		  map1.put(arr1[i], arr2[i]);
	  }
	  Arrays.sort(arr2);
	  Arrays.sort(arr1);
	  for(int i=arr2.length-1;i>=0;i--)   
	  {
		  for(int j=0;j<arr1.length;j++) //ԭ��������֮�󣬱�֤������ͬ��Ԫ������С����ǰ��
		  {
		  if(map1.get(arr1[j])==arr2[i])
		  {	
			  if(!list.contains(arr1[j]))//list�����ų�������ͬ������Ԫ��������
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
