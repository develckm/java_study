package com.econ;

public class L10Char {
	public static void main(String[]args) {
		//�ƽ�Ű�ڵ�� ��ǻ�Ͱ� ������ �� ���� ������ ����(8bit)
	    //�ƽ�Ű�ڵ� ǥ�� 0~127������ ������ ����ϸ� ������ �� �ִ�.
		char c='A';
		//c="a";
		System.out.println((int)c);
		for(int i=0; i<=127; i++) {
			System.out.print(((char)i)+",");
		}
		System.out.println();
		//�����ڵ� ����ǥ�� 16bit ����ǥ�� �ѱ��� ���ԵǾ� �ִ�.
		//char 16bit ¥�� ����ǥ�� �����ϴ� �⺻���̴�. 
		char u=0x41; //�����ڵ�ǥ ���� 
		System.out.println("0x41="+u);
		System.out.println("0xAC00="+(char)0xAC00);
		u='\u0042';
		// \\u �� ����ϸ� �����ڵ� ���ڰ� ��
		System.out.println("\u0042="+u);
		
		System.out.println('A'+'B'); //"AB"(x) 131(o)
		//char ������ �ϸ� ���� �ٲ��.
		
		
	}
}
