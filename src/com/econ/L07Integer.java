package com.econ;

public class L07Integer {
	public static void main(String[]args) {
		long l=100l; //l�� �����ϰ� �����ؾ� long �� ����.
		l=1; //l�� ���� ������ ���� type�� int
		//l=12345678901; //int�� ǥ���� �� �ִ� �ִ밪�� �Ѿ ����Ұ�
		l=1234567890123456789l; 
		l=(long)10000000000000000000000000000000000.23;
		System.out.println(l);
		System.out.println(Long.MAX_VALUE);
		
		int i=1234567890;
		i=(int)Integer.MAX_VALUE+2; //�Ұ��� 
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		//ū ���� ���� Ÿ������ ����ȯ�ϴ� 3���� ���(ĳ����)
		//1.������ �ִ´�. -> �ִ밪�� ������ �ٽ� �ּҰ����� ����.->ó������ �ٽ� ����. (int,short,byte)
		//2.�ִ밪�� ���ϰ� ������ ������. (long)
		//3.���Ѵ�� ǥ���Ѵ�.(float,double)
		
		byte b = 127; //8bit (-128~0~127);
		b=(byte)257;
		System.out.println(b);
		
	}
}
