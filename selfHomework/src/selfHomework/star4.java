package selfHomework;

public class star4 {

	public static void main(String[] args) {
		
		
		/*
		 
	*****
	 ****
	  ***
	   **
	    *	 
		 
		 */
		
		//줄 수
		for (int i = 1; i <= 5; i++) {
			//빈칸개수
			for (int k = i-1 ; k > 0; k--) {
				System.out.print("1");
			}
			//별개수
			for (int j = 5; j-i > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		//더 간단하게
		for (int i = 1; i <= 5; i++) {
			//빈칸개수  (0~4칸)
			for (int k = 1; k < i; k++) {
				System.out.print("1");
			}
			//별개수 (5칸 ~ 1칸)
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		//더 더 간단하게
		for (int i = 1; i <= 5; i++) {
			//빈칸개수  (0~4칸)
			for (int k = 1; k <= 5; k++) {
				if (k <= i-1) {
					System.out.print("1");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
