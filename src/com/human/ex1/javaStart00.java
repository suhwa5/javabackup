package com.human.ex1;
public class javaStart00 {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		//3���ڸ� �Է¹޾� ū����� ����ϴ� ���α׷��� �������� ���α׷��� �����Ͻÿ�
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�����Է�");
		
		String st1 = sc.nextLine();
		int a=Integer.parseInt(st1);
		st1 = sc.nextLine();
		int b=Integer.parseInt(st1);
		st1 = sc.nextLine();
		int c =Integer.parseInt(st1);
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("ū���� "+a +" �߰����� "+ b +" �������� "+ c );
			}
			if(c>b) {
				System.out.println("ū���� "+a +" �߰����� "+ c +" �������� "+ b );
			}
		}else if(b>a && b>c) {
			if(a>c) {
				System.out.println("ū���� "+b +" �߰����� "+ a +" �������� "+ c );
			}
			if(c>a) {
				System.out.println("ū���� "+b +" �߰����� "+ c +" �������� "+ a );
			}
		}else if(c>a && c>b) {
			if(a>b) {
				System.out.println("ū���� "+c +" �߰����� "+ a +" �������� "+ b );
			}
			if(b>a) {
				System.out.println("ū���� "+c +" �߰����� "+ b +" �������� "+ a );
			}
		}
		
		
		
		
		//���������� ���� 10���ؼ� �̱�ȸ�� ���
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		java.util.Random ran= new java.util.Random();		
//	
//		String st2 = "����";
//		String st3 = "����";
//		String st4 = "��";
//		
//		int b = 0;
//		int c = 0;
//		
//		for(b=0; b<10; b++) {
//			System.out.println("����������");
//			
//			String st1 = sc.nextLine();
//
//			int a = ran.nextInt(3);	
//		
//			switch(a) {
//				case 0:{
//					if(st1.equals(st2)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ����    ���");
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ����    �̱�");
//						c++;
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("�������� : ��  ��ǻ�Ͱ� ���� : ����    ��");
//						break;
//					}
//						
//					break;
//				}
//				case 1:{
//					if(st1.equals(st2)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ����    ��");
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ����    ����");
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("�������� : ��  ��ǻ�Ͱ� ���� : ����    �̱�");
//						c++;
//						break;
//					}
//					
//					break;
//				}
//					
//				case 2:{
//					if(st1.equals(st2)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ��    �̱�");
//						c++;
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("�������� : ����  ��ǻ�Ͱ� ���� : ��    ��");
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("�������� : ��  ��ǻ�Ͱ� ���� : ��    ���");
//						break;
//					}
//					
//					break;
//				}
//			}
//			
//			
//			
//		}
//		
//		System.out.printf("���� " + c +"�̱�");
//			
//			
			
	}
}
