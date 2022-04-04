package chap03;

import java.util.Iterator;
import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				index = i; // 검색 성공!(인덱스를 반환)
			} else {
				index = -1;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("만들 배열의 길이를 입력하세요 : ");
		int num = scan.nextInt();
		int[] x = new int[num];		//길이가 num인 배열
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = scan.nextInt();
		int idx = seqSearch(x, num, ky);	//배열 x에서 키값이 ky인 인덱스를 검색
		
		if (idx == -1) {
			System.out.println("그 값의요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}