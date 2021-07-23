package com.greedy.section01.comditional_statement;

import java.util.Scanner;

public class A_if {
	
	/**
	 * <pre>
	 * 단독 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 정수 짝수 여부 판단 확인용
	 * </pre>
	 */
	public void testSimlpeIfStatement() {
	/*
	 * [if문 표현식]
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 명령문 
	 * }
	 * 
	 * 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
	 * 
	 * if문은 조건식의 결과 값이 참(true)이면 {}안에 있는 코드를 실행하고,
	 * 조건식의 결과 값이 거짓(false)이면 {} 안에 코드를 무시하고 넘어간다.
	 */
		
	Scanner sc = new Scanner(System.in);
	
	// 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다"라고 출력
	// 짝수가 아니면 출력하지 않는 구문을 작성하자
	
	System.out.print("숫자 한 개를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(num % 2 == 0) {
		System.out.println("입력하신 숫자는 짝수입니다.");				
	}
	
	if(num % 2 == 1 ) {
		System.out.println("입력하신 숫자는 홀수입니다.");
	}
	
	System.out.println("프로그램을 종료합니다.");

	}

	/**
	 * <pre>
	 * 	중첩 if 구문 흐름을 확인하기 위한 용도의 메소드
	 *  양의 정수 짝수 인지 여부 판단 확인
	 *  </pre>
	 */
	public void testNestedStatement() {
		
		// 중첩된 if문 실행 흐름 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수인지 조건확인 
			
		
			//양수가 맞는 경우 다시 한 번 짝수인지 조건을 확인한다.
			if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			
			}
		}
		
		// 조건문과 상관없이 프로그램 종료를 확인하기 위한 용도
		System.out.println("프로그램을 종료합니다.");
		
	}
}
