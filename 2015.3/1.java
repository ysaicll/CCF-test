/*
��������

������ת��ͼ����Ļ�������������������У�����Ҫ��һ��ͼ����ʱ����ת90�ȡ�
 ����������е�ͼ���ʾ������һ����������ʾ��Ϊ����תһ��ͼ��ֻ��Ҫ����Ӧ�ľ�����ת���ɡ�

�����ʽ

��������ĵ�һ�а�����������n, m���ֱ��ʾͼ������������������
 ����������n��ÿ�а���m����������ʾ�����ͼ��

�����ʽ

�������m�У�ÿ�а���n����������ʾԭʼ������ʱ����ת90�Ⱥ�ľ���

��������

2 3
 1 5 3
 3 2 4

�������

3 4
 5 2
 1 3

����������ģ��Լ��

����1 �� n, m �� 1,000�������е������ǲ�����1000�ķǸ�������
*/
//ͨ����100%

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public void resorve(int pic[][]){
		int col=pic[0].length-1;
		int row=pic.length-1;
		for(int i=col;i>=0;i--)
		{
			for(int j=0;j<=row;j++){
				if(j==row)
					System.out.println(pic[j][i]);
				else
				    System.out.print(pic[j][i]+" ");
			}			
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int pic[][]=new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
				pic[i][j]=scanner.nextInt();
		}
		Main main=new Main();
		main.resorve(pic);
		scanner.close();
        
    }
}


