/*
��������

��������n����ͬ������������Щ�����ж��ٶ����������ǵ�ֵ�������1��

�����ʽ

��������ĵ�һ�а���һ������n����ʾ���������ĸ�����
 �����ڶ��а�����������n��������

�����ʽ

�������һ����������ʾֵ�������1�����Եĸ�����

��������

6
 10 2 6 3 7 8

�������

3

����˵��

����ֵ�������1�����԰���(2, 3), (6, 7), (7, 8)��

����������ģ��Լ��

����1<=n<=1000������������Ϊ������10000�ķǸ�������
*/
//ͨ����100%

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

