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
			for (int j = 5; j-i >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
