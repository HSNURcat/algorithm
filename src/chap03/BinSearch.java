package chap03;

import java.util.Scanner;

import com.sun.source.tree.NewClassTree;

public class BinSearch {
	
	//요소들의 갯수가 n인 배열 a에서 key와 같은 요소를 이진검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;		//검색 범위의 첫 인덱스
		int pr = n - 1;	//검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2; //중앙요소의 인덱스
			
			if (a[pc] == key) { //a배열의 중앙요소의 값과 검색대상(key)가 같으면
				return pc;//검색성공, 검색성공한 값의 위치(인덱스 값)반환
				
			} else if (a[pc] < key) { //a[pc]의 값이 검색대상(key)보다 작으면
				pl = pc + 1;//검색범위의 첫 인덱스(pl)를 중앙인덱스(pc) + 1로 재설정(검색 범위를 a[pc + 1] ~ a[pr])
				
			} else {
				pr = pc - 1;//검색범위의 끝 인덱스(pr)를 중앙인덱스(pc) - 1로 재설정(검색 범위를 a[0] ~ a[pc - 1])
			}
			
		} while (pl <= pr);//검색범위의 첫 인덱스(pl)가 검색범위의 끝 인덱스(pr)보다 작은지 검사
		
		return -1; //검색실패
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열 크기 : ");
		int num = scan.nextInt();//숫자 받아옴
		int[] x = new int[num];//배열크기가 num인 배열 생성
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");//1번째 인덱스 값 입력
		x[0] = scan.nextInt();
		
		for (int i = 1; i < num; i++) {//2번째 인덱스부터 실행
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = scan.nextInt();
				
			} while (x[i] < x[i - 1]);//바로 앞의 요소보다 작으면 다시 입력
			
		}
		
		System.out.println("검색할 값 : "); //검색대상(key값)설정
		int keyValue = scan.nextInt();
		
		int index = binSearch(x, num, keyValue); //배열 x에서 key값이 keyValue인 요소를 검색
		
		if(index == -1) {
			System.out.println("해당 배열에 일치하는 값이 없습니다.");
		} else {
			System.out.println(keyValue + "은(는) x[" + index + "]에 있습니다.");
		}
		
	}
	
}
