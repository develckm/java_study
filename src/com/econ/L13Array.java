package com.econ;
class Month{
	int month; //1,2,3,4~12
	String en_month;//Jan,Feb ....
	String kr_month;//1��,2��
	Month(int month, String en_month){
		this.month=month;
		this.en_month=en_month;
		this.kr_month=month+"��";
	}
}

public class L13Array {
	public static void main(String[]args) {
		//Array�� �ε����� ����Ű�� ����ϴ� ������ ������ Ÿ��
		//�ε����� ���̸� �����ϰ� Object�� �ʵ�θ� ������ �淮 �迭 Ÿ���̴�.
		String [] month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Month [] obj_mon= {new Month(1,"Jan"),new Month(2,"Feb"),new Month(3,"Mar"),new Month(4,"Apr") ,new Month(5,"May") ,new Month(6,"Jul") ,new Month(12,"Dec")};
		
		int[] p_arr={-3000,1000,12000,2500,500,3000};
		System.out.println(p_arr.length);
		System.out.println(p_arr[4]);
		try {
			System.out.println(p_arr[5]);//���̴� 1����, index�� 0���� ����			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� �� �Ǿ��ּ���!");
		
		int p_arr_total=0;
		
		for(int i=0;i<p_arr.length; i++) {
			p_arr_total+=p_arr[i];
		}
		System.out.println(p_arr_total+"won");
		int max = 0; //ó���� �߰��� ���� max
		int max_i=0;
		for(int i=0; i<p_arr.length; i++) {
			if(i==0) {
				max=p_arr[i];
			}else{
				if( max < p_arr[i] ) {
					max=p_arr[i];
					max_i=i;
				}
			}
		}
		System.out.println(max_i+":"+max);
		//�ּҰ��� ã������
		//�ִ밪�� �Ǿ����� �Űܼ� �����ϼ��� (���� ����)
		String [] weeks=new String[7];
		weeks[0]="������";
		weeks[1]="ȭ����";
		weeks[2]="������";
		weeks[3]="�����";
		weeks[4]="�ݿ���";
		weeks[5]="�����";
		weeks[6]="�Ͽ���";
		String [] weeks2= {"��","ȭ","��","��","��","��","��"};	
	}
}



