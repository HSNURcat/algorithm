package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArrayTest {
	static void swap(int[] inputArray, int idx1, int idx2) {
		//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = inputArray[idx1];
		inputArray[idx1] = inputArray[idx2];
		inputArray[idx2] = t;
	}
	
	static void reverse(int[] inputArray) {
		//배열 a의 요소를 역순으로 정렬
		for (int i = 0; i < inputArray.length / 2; i++) {
			swap(inputArray, i, (inputArray.length - 1) - i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("배열 길이 입력: ");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			x[i] = random.nextInt(100);
			System.out.println("x[" + i + "] = " + x[i]);
		}
				
		reverse(x);
		
		System.out.println("ArrayReverse");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
