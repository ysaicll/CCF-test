/*
��������
��������һ���������У�������������ͬ��������������һ�Σ��������й��ж��ٶΣ�
�����ʽ
��������ĵ�һ�а���һ������n����ʾ�����������ĸ�����
�����ڶ��а���n������a1, a2, ��, an����ʾ���������У����ڵ�����֮����һ���ո�ָ���
�����ʽ
�������һ����������ʾ�����������ж���Ρ�
��������
8
8 8 8 0 12 12 8 0
�������
5
����˵��
����8 8 8�ǵ�һ�Σ�0�ǵڶ��Σ�12 12�ǵ����Σ������ڶ�������8�ǵ��ĶΣ����һ��0�ǵ���Ρ�
����������ģ��Լ��
����1 �� n �� 1000��0 �� ai �� 1000��
*/
//ͨ����100%


import java.util.Arrays;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INEG;

public class Main {
public int max(int[]nums){
	int count=0;
	for(int i=0;i<nums.length-1;i++)
	{
		if(nums[i]!=nums[i+1])
			count++;
	}
	return count+1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();    
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        	nums[i]=scanner.nextInt();
        scanner.close();
        Main main=new Main();
       // int nums[]={8,8,8,0,12,12,0,8};
        System.out.println(main.max(nums));      
    }
}
