package selfHomework;

public class star1 {

	public static void main(String[] args) {

		/*
		
		 *
		 **
		 ***
		 ****
		 *****
		 
		*/

		// 포문으로 돌려야하고

		// 1. 일단 반복 5번 (큰 틀)
		// 2. 바뀌는건 별 갯수 (한줄마다)
		// 3.

		// int i = 결국 줄수
		// j = 별
		for (int i = 0; i < 5; i++) {

			// 별갯수
//			for(int j = i; j >= 0; j--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
