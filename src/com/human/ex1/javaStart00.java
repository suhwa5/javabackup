package com.human.ex1;
public class javaStart00 {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		//3숫자를 입력받아 큰수대로 출력하는 프로그램의 순서도와 프로그램을 제출하시오
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("세수입력");
		
		String st1 = sc.nextLine();
		int a=Integer.parseInt(st1);
		st1 = sc.nextLine();
		int b=Integer.parseInt(st1);
		st1 = sc.nextLine();
		int c =Integer.parseInt(st1);
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("큰수는 "+a +" 중간수는 "+ b +" 작은수는 "+ c );
			}
			if(c>b) {
				System.out.println("큰수는 "+a +" 중간수는 "+ c +" 작은수는 "+ b );
			}
		}else if(b>a && b>c) {
			if(a>c) {
				System.out.println("큰수는 "+b +" 중간수는 "+ a +" 작은수는 "+ c );
			}
			if(c>a) {
				System.out.println("큰수는 "+b +" 중간수는 "+ c +" 작은수는 "+ a );
			}
		}else if(c>a && c>b) {
			if(a>b) {
				System.out.println("큰수는 "+c +" 중간수는 "+ a +" 작은수는 "+ b );
			}
			if(b>a) {
				System.out.println("큰수는 "+c +" 중간수는 "+ b +" 작은수는 "+ a );
			}
		}
		
		
		
		
		//가위바위보 게임 10번해서 이긴회수 출력
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		java.util.Random ran= new java.util.Random();		
//	
//		String st2 = "가위";
//		String st3 = "바위";
//		String st4 = "보";
//		
//		int b = 0;
//		int c = 0;
//		
//		for(b=0; b<10; b++) {
//			System.out.println("가위바위보");
//			
//			String st1 = sc.nextLine();
//
//			int a = ran.nextInt(3);	
//		
//			switch(a) {
//				case 0:{
//					if(st1.equals(st2)) {
//						System.out.println("내가낸것 : 가위  컴퓨터가 낸것 : 가위    비김");
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("내가낸것 : 바위  컴퓨터가 낸것 : 가위    이김");
//						c++;
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("내가낸것 : 보  컴퓨터가 낸것 : 가위    짐");
//						break;
//					}
//						
//					break;
//				}
//				case 1:{
//					if(st1.equals(st2)) {
//						System.out.println("내가낸것 : 가위  컴퓨터가 낸것 : 바위    짐");
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("내가낸것 : 바위  컴퓨터가 낸것 : 바위    빔김");
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("내가낸것 : 보  컴퓨터가 낸것 : 바위    이김");
//						c++;
//						break;
//					}
//					
//					break;
//				}
//					
//				case 2:{
//					if(st1.equals(st2)) {
//						System.out.println("내가낸것 : 가위  컴퓨터가 낸것 : 보    이김");
//						c++;
//						break;
//					}else if(st1.equals(st3)) {
//						System.out.println("내가낸것 : 바위  컴퓨터가 낸것 : 보    짐");
//						break;
//					}else if(st1.equals(st4)) {
//						System.out.println("내가낸것 : 보  컴퓨터가 낸것 : 보    비김");
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
//		System.out.printf("내가 " + c +"이김");
//			
//			
			
	}
}
