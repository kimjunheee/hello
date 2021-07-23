package com.greedy.section01.comditional_statement;

import java.util.Scanner;

public class B_ifElse {
	
	/**
	 * <pre>
	 * 단독 if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 정수 홀수 짝수 판별용 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {
		
		/*
		 * [if-else문 표현식] 
		 * if(조건식) {
		 * 		조건식이 true일 때 실행할 명령문;
		 * } else {
		 * 		조건식이 false일 때 실행할 명령문;
		 * }
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("입력 하신 정수는 홀수입니다.");
		} else {
			System.out.println("입력 하신 정수는 짝수입니다.");
		}
	}



	
	/**
	 * <pre>
	 * 	중첩 if-else 구문 흐름을 확인하기 위한 용도의 메소드,
	 * 	정수 양수 or 음수 or 0 중 한 가지 인지 판별용 기능 제공
	 * </pre>
	 */
	public void testNestedIfElseStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 0) {
			
			System.out.println("입력하신 숫자는 양수입니다.");	
		} else if(num != 0) {
			
			System.out.println("입력하신 숫자는 음수입니다.");
		} else {
		
			System.out.println("입력하신 숫자는 0입니다.");
			}
		}
	}