package com.econ;

import java.util.Scanner;

public class L15for {
	public static void main(String[]args) {
		String [] a= {"a","b","c","d"};
		String msg="";
		//�ݺ��� for �ۼ��� (�����; ���Ǻ�; ������){ �ݺ�����Ǵ� �ڵ� }
		for(int i=0;i<a.length;i++) {
			msg+=(i==a.length-1)? a[i] : a[i]+"," ;
		}
		System.out.println("a[]={"+msg+"}");
		
		int i=1; //���� 1���� 10���� �� == 55
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1����10������ ��:"+sum);
		boolean system_on=false;
		do{
			System.out.println("���� �����ϸ� ���� �����ִ� ���α׷��Դϴ�");
			System.out.print("������: ");
			Scanner sc=new Scanner(System.in);
			String start=sc.nextLine();
			System.out.print("����: ");
			sc=new Scanner(System.in);
			String end=sc.nextLine();
			int start_i=Integer.parseInt(start);
			int end_i=Integer.parseInt(end);
			int total=0;
			while(start_i<=end_i){
				total+=start_i;
				start_i++;
			}
			System.out.println("�Է��� ������ ���� :"+total);
			System.out.print("�ý��� ����(y/n) :");
			sc=new Scanner(System.in);
			String exit=sc.nextLine();
			if(exit.equals("y")){
				system_on=false;
			}else if(exit.equals("n")){
				system_on=true;
			}
		}while(system_on);
		//do{}while(���Ǻ�); ���ǿ� ���� �ʾƵ� ������ ���� 1ȸ ����
		int z=10;
		do {
			System.out.println(z);
			z++;
		}while(z<10);
		
	}
}
