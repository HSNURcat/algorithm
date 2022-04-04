package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 인덱스 갯수 : ");
		int numberOfa = scan.nextInt();
		
		int[] a = new int[numberOfa];
		
		for (int i = 0; i < numberOfa; i++) {
			System.out.println("a[" + i + "] :");
			a[i] = scan.nextInt();
		}
		
		System.out.println("배열 b의 인덱스 갯수 : ");
		int numberOfb = scan.nextInt();
		
		int[] b = new int[numberOfb];
		
		for (int i = 0; i < numberOfb; i++) {
			System.out.println("b[" + i + "] :");
			b[i] = scan.nextInt();
			System.out.println("배열 a와 b는 " + 
								(equals(a, b) ? "같습니다." : "같지않습니다."));
		}
	}
}
