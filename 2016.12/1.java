/*
问题描述
　　在一个整数序列a1, a2, …, an中，如果存在某个数，大于它的整数数量等于小于它的整数数量，则称其为中间数。在一个序列中，可能存在多个下标不相同的中间数，这些中间数的值是相同的。
　　给定一个整数序列，请找出这个整数序列的中间数的值。
输入格式
　　输入的第一行包含了一个整数n，表示整数序列中数的个数。
　　第二行包含n个正整数，依次表示a1, a2, …, an。
输出格式
　　如果约定序列的中间数存在，则输出中间数的值，否则输出-1表示不存在中间数。
样例输入
6
2 6 5 6 3 5
样例输出
5
样例说明
　　比5小的数有2个，比5大的数也有2个。
样例输入
4
3 4 6 7
样例输出
-1
样例说明
　　在序列中的4个数都不满足中间数的定义。
样例输入
5
3 4 6 6 7
样例输出
-1
样例说明
　　在序列中的5个数都不满足中间数的定义。
评测用例规模与约定
　　对于所有评测用例，1 ≤ n ≤ 1000，1 ≤ ai ≤ 1000。
*/
//通过率100%


import java.util.Arrays;
import java.util.Scanner;

public class Main {
public int midnum(int []nums){
	if(nums.length==1)          //一个数的本身是中间数（比它大的和比他小的都是0）
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
	if(left+1==nums.length-right)//左右两边剩下的数一样多则mid就是中间数
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
