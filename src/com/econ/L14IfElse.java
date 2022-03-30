package com.econ;

import java.util.Scanner; 

public class L14IfElse {
	public static void main(String[]args) {
		int month=11;//1~12;
		String [] month_arr= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		//1~12���� �Է��� ������ ������ Mar �� �Դϴ�. ����ϼ���.
		//1~12������ �ƴϸ� 1~12���� ���� �Է��ϼ��� ���!! 
		if( month>=1 && month<=12) {
			System.out.println("������ "+month_arr[month-1]+"�Դϴ�.");
		}else {
			System.out.println("1~12���� ���� �Է��ϼ���");
		}
		//���ߴܿ��� ó���ϴ� ����ó��!
		int week=8; //1~7;
		String[] week_arr=new String[7];
		week_arr[0]="Sun";
		week_arr[1]="Mon";
		week_arr[2]="Tues";
		week_arr[3]="Wed";
		week_arr[4]="Thur";
		week_arr[5]="Fri";
		week_arr[6]="Sat";
		//������ �߻����� �� ����ó��
		try {
			System.out.println("������ "+week_arr[week-1]+"�Դϴ�.");	
			System.out.println("������ �߻��ϸ� catch�� �ٷ� �̵��Ѵ�.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����: "+e.getMessage()); //�����ڸ� �����ϴ� �޼���  
			System.out.println("1~7������ �Է��ϼ���!");
		}
		System.out.println("������ �߻��ϸ� �ڹٴ� ������ �����.");
		//if ������ ����ó�� �� �� �̵�
		//1. � ������ �ڵ�󿡼� �߻��ϴ��� �� �� �ִ�.=>��ü������ ������ ���� �� �ִ�.
		//2. ������ �߻��ϱ����� ���� �� �ִ�.
		
		//try catch�� ����� �� �ۿ� ���� ���� 
		//1.����� �� �� ����� ������ ó���� �� 
		//2.���̺귯�� ����Ҷ� if�� ��뿡 �Ѱ谡 ���� �� 
				
		//�ֿܼ� �Է��� ���ڸ� �Է¹޴� System.in
		System.out.print("����� Ȯ���ϰ� ���� �� �Է�:");
		Scanner sc= new Scanner(System.in); //���ڸ� �Է��ϰ� ���� ������ �ϸ� ���ΰ��� �ϱ� ������ �Է��� ���ڵ��� ���� �� �ִ�.
		String month_input=sc.nextLine();
		//"123123"=>����   48<='3'<=59
		//"123a123"=>����   48<='3'<=59
		boolean int_check=true;
		for(int i=0; i<month_input.length(); i++){
			char c=month_input.charAt(i);
			if( !(c>=48 && c<=59) ) {
				int_check=false;
				break;
			}
		}
		System.out.println("�Է��� ���ڴ� ������ ����ȯ ����:"+int_check);
//		if(int_check) {
//			int month_parse=Integer.parseInt(month_input);
//			if(month_parse>0 && month_parse<13) {
//				System.out.println("����� �Է��� ���� "+month_arr[month_parse-1]+" �Դϴ�.");				
//			}else {
//				System.out.println("1~12������ �Է��ϼ���.");
//			}
//		}else {
//			System.out.println("������ �Է��ϼ���!");
//		}
		try {
			int month_p=Integer.parseInt(month_input);
			System.out.println("����� �Է��� ���� "+month_arr[month_p-1]+" �Դϴ�.");				
		}catch(NumberFormatException e) {//���ڿ��� ���� ����ȯ �Ҷ� ���� �ɼ�������(NaN) �߻��ϴ� ���� [js�� ���� �߻� ���� NaN�� ��ȯ]			
			System.out.println("���� �Է��ϼ���.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1~12���� ���� �Է��ϼ���!");
		}
		
		//���ڸ� �Է��ϸ� ���ڿ� �����Ǵ� ������ ����ϼ���!!!
		
	}
}





