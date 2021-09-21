package selfHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// 피보나치수열
		// 0 1 시작
		// 입력 : 5
		// 0
		// 0 1
		// 0 1 1
		// 0 1 1 2
		// 0 1 1 2 3
		// 0 1 1 2 3 5
		// List<Integer> list = new ArrayList<>();
		// list.push(값); - 명령어가 pushㄱㅏ아니라 다른거 add로 추가

		// 출력 받은 값으로 시작 (몇 줄을 출력 받을 건지)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fibo1(n);
		System.out.println(fibo2(n));
	}

	// 이 클래스 안에서만, 보이드는 리턴타입 (리턴하지 않을때 보이드 사용하고, 리턴할때 메인함수에 뭘 보내야할때는, int나 이런걸 사용)

	private static void fibo1(int n) {
		List<Integer> list = new ArrayList<Integer>(); // list 선언		
		
		// 여기서 항상 고정 값은 0,1
		list.add(0);
		list.add(1);

		// 빈칸도 포함 (문자열처럼)

		// 피보나치수열에서의 주의할 점은
		// 피보나치 수열은 재귀의 기초임

		// i는 반복 횟수 첫줄이 나와야 하니까 i값을 1로 잡아줌
		for (int i = 2; i <= n; i++) {
			list.add(list.get(i - 2) + list.get(i - 1));
			System.out.println(list);
		}
	}
	
	// 재귀 함수
	//단점 ex) n= 5 면 3 ... 연산을 여러번 함 이게 재귀의 단점 
	private static int fibo2(int n) {
		
		if (n <= 2) {
			return 1;
		} else {
			return fibo2(n-2) + fibo2(n-1);
			//3 + 4  = 인덱스의 번지수에서 그 값을 가져와서 계산 즉, 인덱스 3번째의값과 인덱스 4번째의 값의 합이 필요
			// 각각 2 + 3 으로 출력 결과는 5가 됨
			//리스트나 배열은 번지수를 가져와서 그 값을 가지고 사용
		}
	}
	
	//이해가 필요
	private static int fibo3(int n) {
		int[] arr = new int[n];
				
		if (n <= 2) {
			return 1;
		}
		if (arr[n] == 0) {
			arr[n] = fibo3(n-2) + fibo3(n-1);  //중복계산한 값을 배열n번째에 넣어줌
		}
		
		return arr[n];

	}

}
