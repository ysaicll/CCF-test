/*
��������
��������n��������ʾһ���̵�����n��������������ĳ��֮ǰ������������������һ�����������٣������һ��Ϊ�۵㣬
     ���������֮ǰ���������ٶ���һ��������������Ҳ����һ��Ϊ�۵㡣�������춼�����۵㡣����ͼ�У���3��͵�6�����۵㡣
����
  ����n������a1, a2, ��, an��ʾ����������������Щ���ܹ��ж��ٸ��۵㡣
����Ϊ�˼������壬���Ǹ��������ݱ�֤������n����������������������ǲ�ͬ�ģ���ai-1��ai��ע�⣬������첻���ڣ�������������ͬ��
�����ʽ
��������ĵ�һ�а���һ������n��
�����ڶ��а���n���������ÿո�ָ����ֱ��ʾa1, a2, ��, an��
�����ʽ
�������һ����������ʾ�۵���ֵ�������
��������
7
5 4 1 2 3 6 4
�������
2
����������ģ��Լ��
�������������������㣺1 �� n �� 1000��ÿ����������ǲ�����10000�ķǸ�������
*/
//ͨ����100%


import java.util.Arrays;
import java.util.Scanner;
public class Main {
public int max(int []nums){
	int count=0;
	if(nums.length<3)
		return 0;
	for(int i=1;i<nums.length-1;i++)
	{
		if(nums[i]>nums[i-1]&&nums[i+1]<nums[i])		
			count++;
		if(nums[i]<nums[i-1]&&nums[i+1]>nums[i])		
			count++;
	}
	return count;
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
        //int nums[]={5,4,1,2,3,6,4};
        System.out.println(main.max(nums));      
    }
}
