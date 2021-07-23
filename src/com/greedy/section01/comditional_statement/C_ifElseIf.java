package com.greedy.section01.comditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	

	/**
	 * <pre>
	 * 	단독 if-else-if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 	금도끼, 은도끼 동화 시나리오를 이용한 if-else-if의 흐름을 이해할 수 있도록 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {
		
		/*
		 * [if-else-if문 표현식]
		 * if(조건식1) {
		 * 	조건식1이 true일 때 실행할 명령문;
		 * } else if(조건식2) {
		 * 	 조건식1이 false이고, 조건식 2가 true일 때 실행할 명령문;
		 * } else {
		 * 	 위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
		 * }
		 * 
		 * */
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어봤다.");
		
		System.out.print("어느 도끼거 너의 도끼이니? (1. 금도끼, 2.은도끼, 3. 쇠도끼)");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		// 조건식
		if(answer == 1) {
			
			System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 욕심쟁이 후후후");
		} else if(answer == 2) {
			
			System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
			
		} else {
			
			System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가라!!!");
		}
		
		System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다.......");
		
	}
	
	/**
	 * <pre>
	 * 중첩 if-elseif 구문 흐름을 확인하기 위한 용도의 메소드
	 * </pre>
	 */
	public void testNestedIfElseIfStatement() {
		
		
		/*
		 * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
		 * 60점 미만인 경우에는 'F'
		 * 추가로 각 등급의 중간점수 95,85,75...인 경우 '+'를 붙여서 등급을 세분화
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("학생의 점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		String grade = ""; //전역변수 //빈 문자열로 값을 넣어준다
		
		if(point >= 90) {
			
			grade = "A"; //지역변수
			
			if(point >= 95) {
				//grade = "A+";
				grade += "+"; //grade = grade + "+"
			}
			
		} else if(point >= 80) {
			
			grade = "B";
			
			if(point >= 85) {
				
				grade += "+"; 
			}
		} else if(point >= 70) {
			
			grade = "C";
			
			if(point >= 75) {
				grade += "+";
			}
		} else if(point >= 60) {
			
			grade = "D";
			
			if(point >= 65) {
				grade += "+";
			}
		} else {
			
			grade = "F";
		}
		
		System.out.println(name + "학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
		


public void improvetestNestedIfElseIfStatement() {
	
	/*
	 * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
	 * 60점 미만인 경우에는 'F'
	 * 추가로 각 등급의 중간점수 95,85,75...인 경우 '+'를 붙여서 등급을 세분화
	 * */
	Scanner sc = new Scanner(System.in);
	System.out.print("학생의 이름을 입력하세요 : ");
	String name = sc.nextLine();
	System.out.print("학생의 점수를 입력하세요 : ");
	int point = sc.nextInt();
	
	String grade = ""; //전역변수 //빈 문자열로 값을 넣어준다
	
	if(point >= 90) {
		
		grade = "A"; //지역변수
		
	} else if(point >= 80) {
		
		grade = "B";
		
	} else if(point >= 70) {
		
		grade = "C";
		
	} else if(point >= 60) {
		
		grade = "D";
		
	} else {
		
		grade = "F";
	}
	
	if(point % 10 >= 5 && point >= 60 || point == 100) {
		grade += "+"; 
	}
	
	System.out.println(name + "학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
	System.out.println("프로그램을 종료합니다.");
	
	
	}
}
