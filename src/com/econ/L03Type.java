package com.econ;
//import java.util.*;  String,Integer,Byte,System......
class Obj{ //��üX==������Ʈx,��ü�� ���赵 -> data==��ü ???
	int i=10; //��ü�� �ʵ�,�Ӽ�,������Ƽ�� �� i�� ���� 
	Obj(){} //������ (��������)
}
class Text{
	String s="���ڿ� �ʵ� s";
}
//Ÿ�� class �̸��� ��Ģ 
//1.��Ÿǥ��� ����
//2.������ �빮�� �ʼ� (������ ���� x, Ư������ ���� x )
//3.����+���� �ʼ� ("_"���� Ư�����ڿ� �ٸ� ��� ����)
//4.���� �̸��� ��Ű�� �̸� ���� (com.econ.Obj : class ���� �ߺ��� �����ϱ� ����=>��Ű�� �̸� �����ؼ� �ߺ��� �̸� ����)
//��) com.econ.String (��), java.util.String(x)

//new Obj() : ��ü
//class Obj : Ÿ��
//int i : �������� ��ü�� �ʵ�
//Obj o : ���� 
/*class obj = ���� �̸�
 * int i=��� x, ��ġ�� 
 * obj o = ��������� ���� X, ��ü�� ������ �̸� 
 * new ������, Obj() ������  = ��ü�� ����� ����
 * new Obj()  = �����ϴ� DATA,���⹰
 * */
public class L03Type {
	public static void main(String []args) {
		//type==class 
		Obj o=new Obj(); //��ü ���� ��Ģ : new �����ڷ� �����ڸ� ȣ��
		System.out.println(o.i); //new Obj() ��ü�� �ʵ� i�� ����ϼ���!
		//System.out.println(Obj.i) //Ÿ���� ���赵�� ��ü�� �ƴϴ�.
		//o=new Text(); //������ ó�� ������ �� Ÿ�԰� ������ ��ü�� ���� ����
		Text t=new Text(); //������ ���� ����
		t.s+="/ ���ڿ��� ���ϱ� ���� ����";
		System.out.println(t.s);
	}
}
