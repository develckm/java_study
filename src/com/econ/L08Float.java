package com.econ;

public class L08Float {//float: �յ� ���ִ� �Ǽ� , double : float�� ��
	public static void main(String[]args) {
		float f=123456789012345678901234567789012345678.0f; //float�� ������ f�� ���δ�.
		System.out.println(f);
		//123456789012345678901234567789012345678.0f => 1.2345679E38
		//1. float�� �����ο� ������ ������ �����ϱ� ������ �ε��Ҽ��� ���·� ����
		//2. �����η� ǥ���� �� �ִ� ���̰� 23bit�� int���� �۱� ������ �������� ǥ������ ���Ѵ�.
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.MIN_EXPONENT);
		System.out.println(1.1*1.1); //1.21=>1.2100000000000002
		//�Ǽ��� �����İ� ������ ��Ȯ���� ����߸���. �������� �ִ� ũ�Ⱑ 127������ 38�� ����Ѵ�.
		//float ���� ū���� double ���̴�.
		f=12345678912345689l; //long�� ����ȯ�� �ʿ����.
		System.out.println("12345678912345689l=>"+f);
		f=(float)123456789.0e200; //double�� float�� ����
		System.out.println(f);
		//�Ǽ����� Infinity�� ����ȯ�Ѵ�.(������ Infinity�� ����)
		System.out.println(Float.isInfinite(f));//���Ѵ� �˻��ϴ� �Լ�
		
		double d = 123.1; //�׳� �Ҽ��� �ۼ��ϸ� ���� Ÿ���� �ȴ�.
		d=10/0.0; //0�� ����� ���� ������ ���Ѵ��.
		System.out.println(d);
		d=10%0.0; //=???NaN 0�� ����� ���� ���� �������� �˼� ����.
		System.out.println(d);
		System.out.println(Double.isNaN(d));

		d=10/0; //java���� 0�� ������ ������

		
		
	}
}





