package com.greedy.section01.comditional_statement;

public class Application {

	public static void main(String[] args) {
		
		A_if a = new A_if();
		// 단독 if문 흐름 확인용
		//a.testSimpeIFStatement();
		
		
		// 중첩 if문 흐름 확인용 메소드
		//a.testNestedIfStatement();
//		a.testNestedStatement();

		
		B_ifElse b = new B_ifElse();
		//b.testNestedIfElseStatement();
//		b.testSimpleIfElseStatement();
		
		C_ifElseIf c = new C_ifElseIf();
		//b.testNestedIfElseStatement();
//		c.testSimpleIfElseStatement();
//		c.testNestedIfElseIfStatement();
//		c.improvetestNestedIfElseIfStatement();
		
		D_switch d = new D_switch();
//		d.testSimpleSwitchStatement();
		d.testSwitchVengingMachine();
//		
	}
	

}
