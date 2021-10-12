package selfHomework;

import java.util.Scanner;

public class plus_digitNum1 {

	public static void main(String[] args) {
		// 자릿수 더하기
		// 3자리 수를 구하려면 n/100
		// 2의 자리는 n/10
		// ex)365를 구한다 치면 답은 3+6+5 = 14
		// ex) 365/100 몫은 3 나머지는 65, 다시 /10 몫 6, 나머지 5
		// 그모든것을 다 더하기

		System.out.println("자연수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solution(input));
	}

	private static String solution(String num) {
		
		String answer = "";
		String[] arr = num.split("");
		
		for(int i = 0; i < arr.length; i++) {
			//answer += arr[i].length(); (오답)
			//answer += parseInt(arr[i]); (오답)
			//---------------------------------뭐가 문제일지 생각해보기
			
		}
		return answer;
	}

	private static String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
