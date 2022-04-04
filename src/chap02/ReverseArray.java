package chap02;

import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		//배열 a의 요소를 역순으로 정렬
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, (a.length-1) - i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인덱스 갯수(배열의 길이)를 입력하세요 : ");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("배열 X[" + i + "]의 value값을 입력해주세요 : ");
			x[i] = scan.nextInt();
		}
		
		reverse(x); // 배열 x의 value값들을 역순으로 정렬
		
		System.out.println("배열을 역순으로 정렬했습니다.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
