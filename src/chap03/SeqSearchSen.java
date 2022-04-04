package chap03;

import java.util.Scanner;

public class SeqSearchSen {
	// 요소수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int seqSearchSen(
			int[] a, //배열 
			int n,  //배열길이
			int key	//key
			) {
		
		int j = 0;
		a[n] = key; //보초를 추가
		
		for (j = 0; j < a.length; j++) {
			if(a[j] == a[n]) {
				break;
			} 
		}
		return (j == n ? -1 : j);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("만들 배열의 길이를 입력하세요 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];		//길이가 num인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = scan.nextInt();
		int idx = seqSearchSen(x, num, ky);	//배열 x에서 키값이 ky인 인덱스를 검색
		
		if (idx == -1) {
			System.out.println("그 값의요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}
