/*
��������
����С���������ù�Ʊ�Ĳ����̶����о���Ʊ��С���õ���һֻ��Ʊÿ������ʱ�ļ۸�����֪������ֻ��Ʊ�����������󲨶�ֵ�Ƕ��٣������⼸����ĳ�����̼۸���ǰһ�����̼۸�֮��ľ���ֵ����Ƕ��١�
�����ʽ
��������ĵ�һ�а�����һ������n����ʾС���õ������̼۸������������
�����ڶ��а���n�������������α�ʾÿ������̼۸�
�����ʽ
�������һ����������ʾ��ֻ��Ʊ��n���е���󲨶�ֵ��
��������
6
2 5 5 7 3 5
�������
4
����˵��
����������͵�����֮��Ĳ�����󣬲���ֵΪ|3-7|=4��
����������ģ��Լ��
����������������������2 �� n �� 1000����Ʊÿһ��ļ۸�Ϊ1��10000֮���������
*/
//ͨ����100%


import java.util.Arrays;
import java.util.Scanner;

public class Main {
public int max(int []nums){
	int abs=Integer.MIN_VALUE;
	for(int i=0;i<nums.length-1;i++)
	{
		if(Math.abs(nums[i]-nums[i+1])>abs)		
			abs=Math.abs(nums[i]-nums[i+1]);					
	}
	return abs;
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
        //int nums[]={10,5,5,7,3,5};
        System.out.println(main.max(nums));      
    }
}
