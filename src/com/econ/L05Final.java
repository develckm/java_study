package com.econ;
class MathInfo{
	final double PI=3.141592653589793238462643;
}

public class L05Final {
	public static void main(String [] args) {
		//����(���Ҽ��ִ� ��) ??
		//1.�����ϴ� ��ü�� �ٲ� ���ִ�.
		int i=10; //js: let (int) i=10;
		i=20;
		//���(�������ʴ�[const] ��) const I=10;
		final int I=10; 
		//I=20;
		//js ����� ���� ����ϳ���?? 
		//let arr=[1,2,3,4];
		//arr=20;	
		//arr[0]; ����!
		//const arr=[1,2,3,4]
		//arr=20; �Ұ�
		//������ �����ϱ����� 
		//�ٲ�� �ȵǴ� ���� �����ϱ� ����  
		System.out.println(Integer.MAX_VALUE);
		final double PI=3.14;  //�ٲ��� �ʴ� ������ �����Ҷ�
		//����� �빮�ڷ� �ۼ��ϴ� ������ ������ ���̸� �ֱ����� (�����ڰ��� ���)s
		
		//�������� 2�� ���� ����
		MathInfo math=new MathInfo();
		System.out.println("��������2�� ���� ����:"+(2*2*math.PI));
	}
}
