package com.greedy.section01.comditional_statement;

import java.util.Scanner;

public class D_switch {

	/**
	 * <pre>
	 * 	 switch문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 	 switch문을 이용한 간단한 계산기 만들기
	 * </pre>
	 */
	public void testSimpleSwitchStatement() {
		
		/*
		 * [switch문 표현식]
		 * switch(비교할변수) {
		 *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 * 	   case 비교값2 : 비교값2의 일치하는 경우 실행할 구문; break;
		 * 	   default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 * }
		 * 
		 * 
		 * switch문으로 비교가능한 값은 정수, 문자, 문자열 형태의 값
		 * 			   비교불가능한 값은 실수와 논리
		 * 			   (문자열 비교는 jdk 1.7이상부터 가능)
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.println("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		// 연산의 결과를 저장할 변수
		int result = 0;
		
		switch(op) {
		    case '+' : 
		    	result = first + second;
		    	break;
		    case '-' : 
		    	result = first - second;
		    	break;
		    case '*' : 
		    	result = first * second;
		    	break;
		    case '/' : 
		    	result = first / second;
		    	break;
		    case '%' : 
		    	result = first % second;
		    	break;

		}
		
		System.out.println(first + " " + op + second + " = " + result);
		
	}
	
	/**
	 * <pre>
	 * switch문으로 문자열 값 비교 테스트 및 break 테스트
	 * switch문을 이용한 간단한 자판기
	 * </pre>
	 * 
	 */
	public void testSwitchVengingMachine() {
		
		System.out.println("=== greedy vending machine ===");
		System.out.println(" 사이다  콜라  환타  바카스  핫식스 ");
		System.out.println("==============================");
		System.out.print("음료를 선택해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.next(); // 스위치문에서 switch(sc.next())사용해도 괜찮음!
		
		int price = 0; //초기값
		
		switch(selectedDrink) {
			case "사이다" :
				System.out.println("사이다를 선택하셨습니다.");
				price = 500;
				
			case "콜라" :
				System.out.println("콜라를 선택하셨습니다.");
				price = 600;
			case "환타" :
				System.out.println("환타를 선택하셨습니다.");
				price = 700;
			case "바카스" :
				System.out.println("바카스를 선택하셨습니다.");
				price = 2000;
			case "핫식스" :
				System.out.println("핫식스를 선택하셨습니다.");
				price = 10000;
		}
		
		System.out.println(price + "원을 투입해주세요!!!");
		
		//------------------
		System.out.println("------------ 개선된 자판기 ------------");
		
		String order = "";
		
		switch(selectedDrink) {
			case "사이다" :
				order = "사이다";
				price = 500;
				break;
			case "콜라" :
				order = "콜라";
				price = 600;
				break;
			case "환타" :
				order = "환타";
				price = 700;
				break;
			case "바카스" :
				order = "바카스";
				price = 2000;
				break;
			case "핫식스" :
				order = "핫식스";
				price = 10000;
				break;
	}
	
	System.out.println(order + "를 선택하셨습니다.");
	System.out.println(price + "원을 투입해주세요!!!");
	
	}
	
}
