package com.econ;

public class L09OperatorMath {
	public static void main(String[] args) {
		//���� ������ (�켱������ ������� ����)
		//(����)++,-- 
		//(��ȣ)+,- 
		//(���)*,/,%
		//(���)+,-  
		//(��) >,< ,>=,<=
		//(����) ==,!=  //��ü�� ���Ҷ��� ��������񱳿���(�ּ�)
		int i=20;
		System.out.println(++i*10);//201 ? 210
		System.out.println(i); //++i ==>i=i+1;
		System.out.println(-i);
		System.out.println(i-40.5); 
		
		//i-=10.6; //10.8  //���Կ����� ����ϸ� �ڵ� ����ȯ�� �ȴ�.
		i=(int)(i-10.6); 
		System.out.println(i); //�Ǽ��� ������ ����ȯ�ϸ� �Ҽ��� �����̵ȴ�. 10.6->10, -0.7=>0
		i=(int)-0.7;
		System.out.println(i);
		
		System.out.println(i>0);
		System.out.println(i>=0);
		//����񱳴� �ּҸ� ���ϴ� ���������� 
		//��� ���� ��(�⺻������ Ÿ�� �� ��)�� ���� ���Ѵ�.(ĳ�������� ����ȯ �� ��)
		//(��)��ü�� �⺻������Ÿ�� ���� ���ϸ� ��ü�� ĳ���� ����ȯ �Ѵ�.
		int z_i=0;
		double z_d=0.0;
		float z_f=0.0f;
		long z_l=0l;
		
		System.out.println(i==(int)z_d);
		System.out.println(i==z_f);
		System.out.println(i==z_l);
		System.out.println(i==(short)0);
		System.out.println(i==(byte)0);
		
		Integer obj_i1=new Integer(0);
		Integer obj_i2=new Integer(0);
		System.out.println(obj_i1==obj_i2);
		System.out.println(obj_i1==z_i);
		//����Ŭ������ ĳ���� ����ȯ�� ����
		System.out.println((int)obj_i1==z_i);
		System.out.println(new Integer(0)==0);
		
		//System.out.println("10"==10);

	}
}






