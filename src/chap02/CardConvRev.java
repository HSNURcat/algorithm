package chap02;

import java.util.Scanner;

public class CardConvRev {
	
	public static int CardConvR(int inputNumber, int cardinalNumber, char[] inputArray) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			inputArray[digits] = dchar.charAt(inputNumber % cardinalNumber);
			inputNumber = inputNumber / cardinalNumber;
			digits++;
		} while (inputNumber != 0);
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number; //변환하려는 정수
		int cardinalNumber;	//기수
		int convertedNumber;	//변환 후의 각 자릿수
		int retry;	//다시 한 번?
		char[] cNumArray = new char[32]; // 변환후의 각 자리 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환 합니다.");
		do {
			do {
				System.out.print("변환하려는 양의 정수를 입력하세요 : ");
				number = scan.nextInt();
			} while(number < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~32) : ");
				cardinalNumber = scan.nextInt();
			} while (cardinalNumber < 2 || cardinalNumber > 36);
			
			convertedNumber = CardConvR(number, cardinalNumber, cNumArray);
			
			System.out.print(number +"를 " + cardinalNumber + "진수로 바꾸면 ");
			
			for (int i = convertedNumber - 1; i >= 0; i--) {
				System.out.print(cNumArray[i]);
			}
			System.out.println(" 입니다.");
			
			System.out.print("한번 더 할까요? (1. 예 / 2. 아니요) : ");
			retry = scan.nextInt();
			System.out.println("\n---------------------------------------------------------");
		} while (retry == 1);
	}
}

