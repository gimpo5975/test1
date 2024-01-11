package method;

import java.util.Scanner;

public class PrintExam {
	//메소드를 이용해서 용지 인쇄하기
	public static void main(String[] args) {
		// 초기 용지: 100장 => papaerNum = 100
		// 인쇄방식: 단면(true)과 양면(false) => int printMethod;
		// 양면 = 인쇄할 매수 % 2 == 0 => 인쇄매수 / 2
		// 인쇄할 매수 % 2 == 1 => 인쇄매수 /2 +1
		// 인쇄할 매수를 입력 받기 => printAmount
		// 출력형태
		// ~장 출력
		// 남은 용지매수는 ~장
		// 용지를 출력하려 할때 용지가 없는 경우, 용지가 부족한 경우, 용지가 남는 경우
		// if ~ else

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		System.out.print("인쇄방식 선택 [1]단면	[2]양면");
		int printMethod = sc.nextInt();// 인쇄방법 선택

		System.out.print("인쇄할 매수 입력 >> ");
		int printAmount = sc.nextInt();// 인쇄할 매수 입력

		printShow(printAmount, printMethod);// 매소드 호출

	}// end of main

	public static void printShow(int printAmount, int printingMethod) {

		int paperNumber = 100;// 초기 용지
		// 양면인쇄일 때
		if (printingMethod == 2) {
			// 인쇄할 용지 매수 인쇄할 용지매수가 짝수일 때 : 인쇄할 용지 매수가 홀수일 때
			printAmount = (printAmount % 2 == 0) ? printAmount / 2 : printAmount / 2 + 1;// 삼항연산으로 인쇄방식, 인쇄량 선택
		} // end of if 조건 참일 때 : 거짓일 때

		if (paperNumber == 0) {// 기본용지가 없을 때
			System.out.println("용지 없음");
		} else if (paperNumber < printAmount) {// 인쇄할 매수가 기본용지보다 많을때
			System.out.println("용지 부족 :" + (printAmount - paperNumber));// 인쇄할 매수 - 기본용지
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0; // 기본 용지를 0으로 설정
		} else {
			paperNumber -= printAmount;// 인쇄후 남은용지는 기본용지에서 출력한용지 차감
			System.out.println(printAmount + "장 출력");
			System.out.println("남은 용지는 " + paperNumber);
		} // end of if

	}// end of printShow

}// end of class
