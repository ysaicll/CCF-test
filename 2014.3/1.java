/*
��������

������ N �������Ҹ�����ͬ�������������һ����������������ж��ٶ��෴��(a �� -a Ϊһ���෴��)��

�����ʽ

������һ�а���һ�������� N��(1 �� N �� 500)��
 �����ڶ���Ϊ N ���õ����ո�����ķ�������,ÿ�����ľ���ֵ������1000,��֤��Щ����������ͬ��

�����ʽ

����ֻ���һ������,���� N �����а������ٶ��෴����

��������

5
 1 2 3 -1 -2

�������
*/
//ͨ����100%

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

