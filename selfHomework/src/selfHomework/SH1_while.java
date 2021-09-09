package selfHomework;

import java.util.Random;
import java.util.Scanner;

public class SH1_while {
	public static void main(String[] args) {

		// up & down Game

		// 1. 랜덤적으로 뽑을 숫자!

		// 2. 임의의 난수뽑는 random 클래스

		// 3. 뽑힌 값과 user 입력한 값 비교!

		// 4. user < 임의의 난수: 업

		// 5. user > 임의의 난수: 다운

		// 6. user == 임의의 난수: 맞았다!

		// 몇번 이내 맞출지~ 횟수!

		// 랜덤클래스 가져오기!포함시키기!

		Random r = new Random();

		Scanner sc = new Scanner(System.in);

		// nextInt(개수) 0~개수

		// nextInt(개수) + 시작수

		while (true) {

			System.out.println("**************");

			System.out.println("1. 게임 시작");

			System.out.println("2. 게임 종료");

			System.out.println("**************");

			int user = sc.nextInt(); // 시작!

			switch (user)

			{

			case 1:

				System.out.println("게임시작");

				int qu = r.nextInt(100) + 1;

				int user1;

				int count = 0;

				for (; count < 10; count++)

				{

					System.out.println(">>>");

					user1 = sc.nextInt();

					if (qu == user1) {

						System.out.println("맞았다");

						break;

					} else if (qu < user1) {

						System.out.println("down");

					} else {

						System.out.println("up");

					}

				}

				if (count == 10)
					System.out.println("10회 입력되었습니다");

				break;

			case 2:

				System.out.println("게임종료");

				return;

			// 메서드를 완전히 종료해라!

			}// switch조건문의 끝!

		} // while 반복문의 끝

	}

}
