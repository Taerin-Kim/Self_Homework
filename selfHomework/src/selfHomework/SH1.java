package selfHomework;

import java.util.Random;
import java.util.Scanner;

public class SH1 {

	// 업다운 게임 만들기

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("업다운 게임을 시작합니다.(10번 안으로 맞춰주세요)");
		System.out.println("숫자를 입력해주세요 (숫자는 1~100사이의 수입니다.)");

		int n = sc.nextInt();

		// 랜덤함수 사용하기 Math.random()

		Random rd = new Random();
		int num = rd.nextInt();

		
		
		for (int game=1 ; game<=10; game++) {
			if (num < n) {
				System.out.println("UP!");
			} else if (num > n) {
				System.out.println("DOWN!");
			} else if (n == num) {
				System.out.println("정답입니다!");
			}
		}
		System.out.println("다시 게임을 하시려면 재시작을 눌러주세요!");

	}

}