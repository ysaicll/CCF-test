/*
��������
��������һ��ʮ��������n�����n�ĸ�λ����֮�͡�
�����ʽ
��������һ������n��
�����ʽ
�������һ����������ʾ�𰸡�
��������
20151220
�������
13
����˵��
����20151220�ĸ�λ����֮��Ϊ2+0+1+5+1+2+2+0=13��
����������ģ��Լ��
�������������������㣺0 �� n �� 1000000000��
*/
//ͨ����100%


import java.util.Arrays;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INEG;

public class Main {
public int max(long n){
	int sum=0;
	String len=Long.toString(n);
	for(int i=0;i<len.length();i++)
	{
		sum=sum+Integer.parseInt(len.charAt(i)+"");
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        scanner.close();
        Main main=new Main();      
        System.out.println(main.max(n));      
    }
}