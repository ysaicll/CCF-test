/*
��������
������һ����������a1, a2, ��, an�У��������ĳ��������������������������С���������������������Ϊ�м�������һ�������У����ܴ��ڶ���±겻��ͬ���м�������Щ�м�����ֵ����ͬ�ġ�
��������һ���������У����ҳ�����������е��м�����ֵ��
�����ʽ
��������ĵ�һ�а�����һ������n����ʾ�������������ĸ�����
�����ڶ��а���n�������������α�ʾa1, a2, ��, an��
�����ʽ
�������Լ�����е��м������ڣ�������м�����ֵ���������-1��ʾ�������м�����
��������
6
2 6 5 6 3 5
�������
5
����˵��
������5С������2������5�����Ҳ��2����
��������
4
3 4 6 7
�������
-1
����˵��
�����������е�4�������������м����Ķ��塣
��������
5
3 4 6 6 7
�������
-1
����˵��
�����������е�5�������������м����Ķ��塣
����������ģ��Լ��
����������������������1 �� n �� 1000��1 �� ai �� 1000��
*/
//ͨ����100%


import java.util.Arrays;
import java.util.Scanner;

public class Main {
public int midnum(int []nums){
	if(nums.length==1)          //һ�����ı������м�����������ĺͱ���С�Ķ���0��
		return nums[0];
	if(nums.length==2){
		if(nums[0]==nums[1])
			return nums[0];
		else
			return -1;
	}
	Arrays.sort(nums);
	if(nums.length<3)
		return -1;
	int mid=nums[nums.length/2],left=nums.length/2-1,right=nums.length/2+1;
	while(left>=0&&mid==nums[left]){
		left--;
	}
	while(right<=nums.length-1&&mid==nums[right]){
		right++;
	}
	if(left+1==nums.length-right)//��������ʣ�µ���һ������mid�����м���
		return mid;
	else {
		return -1;
	}
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
       // int nums[]={1,2,3,4,3,3,4,3,4};
        System.out.println(main.midnum(nums));      
    }
}
