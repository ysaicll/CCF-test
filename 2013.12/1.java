/*
��������

��������n�����������ҳ������г��ִ�����������������������ж���������������С��һ����

�����ʽ

��������ĵ�һ��ֻ��һ��������n(1 �� n �� 1000)����ʾ���ֵĸ�����
 ��������ĵڶ�����n������s1, s2, ��, sn (1 �� si �� 10000, 1 �� i �� n)�����ڵ����ÿո�ָ���

�����ʽ

���������n�������г��ִ�����������������������ж�������������С��һ����

��������

6
 10 1 10 20 30 20

�������

10
*/
//ͨ����50%

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

