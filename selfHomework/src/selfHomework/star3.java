package selfHomework;

public class star3 {

	public static void main(String[] args) {

		/*
		 
		 *
		**
	   ***
	  ****
	 *****
		 
		 
		 */

		// 1. 5줄 반복
		// 2. 빈칸부터 출력할것
		// 3. 별이 마지막에 출력

		// 5줄 완성
		for (int i = 1; i <= 5; i++  ) { //내가뭘로햇지...
		//for (int i = 1; i <= 5; i++) { //매칭
			//빈칸이 5개씩 나옴 j = 빈칸 
			for (int j = 5-i; j > 0; j--) {  //왜이렇게 처음에 짰는지 생각할 것 
			//for (int j = 4-i; j > 0; j--) {
			//for (int j = 5-i; j > 0; j--) {	//매칭
				System.out.print("1");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		// 5줄 완성
		for (int i = 1; i <= 5; i++) { //내가뭘로햇지...
		
			for (int j=0; j<5; j++) {
				if (j < 5-i) {
					System.out.print("1");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
