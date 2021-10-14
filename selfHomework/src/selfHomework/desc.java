package selfHomework;

import java.util.Random;
import java.util.Scanner;

public class desc {

	public static void main(String[] args) {
		//임의의 정수를 받아서 내림차순
		//random 함수 사용
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Math.random(); 
		
		랜덤출력
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			int value = 랜덤값;
			arr[i] = value;
		}
		
	}

	public static int solution(int[] arr) {
		// 랜덤값을 변수에 담아주고
		// 그 변수가 arr에 있는지 확인해주고
		// 1. 있으면 -> 한번 더 랜덤값을 출력
		// 2. 없으면 그 변수를 return
		
		double rd = Math.random();
		
		boolean notExist = true; //존재할때
		
		while(notExist) {
			int rdValue = (int)(rd*100) + 1; // 1~100까지의 정수
			
			for(int i = 0; i < arr.length; i++) {
				if(rdValue == arr[i]) { // 검사하는 배열값안에 우리가 뽑은 랜덤값이 있을경우, 즉 중복제거
					break;
				} 
			}
		
		}
		
		return arr;
		
	}
}
