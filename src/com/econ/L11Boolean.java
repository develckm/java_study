package com.econ;

public class L11Boolean {
	public static void main(String[]args) {
		boolean b=true;//(0�� 1�θ� �̷���� 1bit ���������� 1byte ũ���� �޸𸮸� �����Ѵ�.=>�ڹٰ� ����ϴ� �ּҴ����� �޸�ũ�� 1byte)
		//b=1;
		//b=0;
		//b=null;
		b=(1<0);
		//�񱳿����� ����� boolean�� ��ȯ�Ѵ�.
		System.out.println(b);
		int age=37;
		String msg="";
		if(age>35) {
			msg="������";
		}else{
			msg="�Ѱ�";
		}
		System.out.println(msg);
		
		msg=(age>35)?"A":"C";
		System.out.println(msg);
		
		//b=(boolean)1;
		//b=(boolean)0;
		String test;
		//System.out.println(test); //����
		//if(test!=undefined){}
		test=null; //js null�� �⺻������ Ÿ���̾����� java������ ����ִٴ� �ǹ� �� �̻��� �ƴϴ�.
		System.out.println(test);
		 if(test==null) {
			 System.out.println("test�� null�Դϴ�.");
		 }
		 //if(null) if(undefined) if(0) if("") if(NaN) (x)
		 //if(10%0.0==NaN)
		 System.out.println(Float.isNaN(10%0.0f));
		 if(Float.isNaN(10%0.0f)) {
			 System.out.println("0�� ����� ���� ���� �������� ���� �ƴմϴ�.");
		 }
		 int pars_i=Integer.parseInt("10");
		 System.out.println(pars_i+11);
		 System.out.println(Integer.parseInt("t")); //NaN type�� �������� �ʴ´�.
	}
}






