package com.econ;

import java.util.Iterator;

public class L16MultiArray {
	public static void main(String[]args) {
		//String[][] multi=new String[4][3]; //���� ũ���� 2���� �迭 ���� 
		String[][] multi =new String[4][]; //2���� �迭�� �������̷� ���� (�����迭)
		multi[0]=new String[3];
		multi[1]=new String[1];
		multi[2]=new String[4];
		multi[3]=new String[5];
			
		String[][] multi_arr= {	
								{"����","����","����"},
								{"���","��","��","ü��"},
								{"�丶��","����","������ī"},
								{"����","��","��"}
							};
		//�ݺ��� > �ݺ��� ����ؼ� �迭�������� ����ϱ�
		System.out.println("{");
		for(int i=0; i<multi_arr.length; i++) {
			System.out.print("{");
			for(int j=0; j<multi_arr[i].length; j++) {
				System.out.print(multi_arr[i][j]+",");
			}
			System.out.print("}");
			System.out.print(",\n");// \\n�� ���ΰ����� Ư������
		}
		System.out.println("}");
		
		String [][] stars= {
				{"*"},
				{"*","*"},
				{"*","*","*"},
				{"*","*","*","*"},
				{"*","*","*","*","*"},
				{"*","*","*","*","*","*"}};
		System.out.println("�����!");
		System.out.println("�迭 ���� �����(�ﰢ�� ������� �ٲٱ�");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int[] nums= {-200,10,1,300,-5}; //���� ���� �غ�����!!
	}
}













