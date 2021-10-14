package selfHomework;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// 난수 값 받고 랜덤 해주고, 중복값 제거해서 내림차순

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하세요"); // count값을 줌
		Random rd = new Random();
		int count = sc.nextInt();

		int[] result = new int[count];
		
		for (int i=0; i<count; i++) {
			
			while(true) { //중복값이 있으면 없는 수 나올때까지 반복
				int rdVal = rd.nextInt(100); // 0~100 - 랜덤값을 뽑아줌
				boolean check = true; //중복값이 없으면 true 있으면 false로 바꿔줌
				
				//false로 바꿔주는 반복문(중복체크)
				for (int j = 0; j < result.length; j++) {
					if (result[j] == rdVal) {
						check = false;
						break;
					}
				}
				//만약 중복값이 없으면 while문 종료
				if (check == true) {
					result[i] = rdVal;
					break;
				}
			}
		}
		
		//배열에 저장된 값을 내림차순으로 검사해서 정렬
		int temp = 0; // temp에 값을 저장해놓고
		
		for(int i = 0; i < result.length-1; i++) { //인덱스가 5까지면 4까지만 확인(마지막전까지만 검사)
			for(int j = i+1; j  < result.length; j++ ) { //다음인덱스 값이랑 비교
				if(result[i] < result[j]) {
					temp = result[j]; 
					result[j] = result[i]; // []배열번지수임
					result[i] = temp;
					//else 사용하면 안됨, 왜냐면 else 넣는 순간 if 조건을 벗어나게 됨
					//비교한 값이 더 클때만 바꿔주면 되니까 (인덱스순서를)
				}
		}
			
			
		}
		
		//값 출력문
		System.out.print("{");
		for (int i = 0; i < count; i++) {

			if (i != count - 1) {
				System.out.print(result[i] + ".");
			} else {
				System.out.print(result[i]);
			}

		}
		System.out.print("}");
	}
}