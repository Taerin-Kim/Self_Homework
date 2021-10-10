package selfHomework;

import java.util.Scanner;

public class Hide_phoneNumber {

	public static void main(String[] args) {
		// 뒷자리 4개를 제외하고 폰번호 가리기
		System.out.println("번호만 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.print(solution(n));

	}

	    private static String solution(String phone_number) {
	        String answer = "";
	        String[] a = phone_number.split("");
	        for(int i= 0; i<a.length; i++){
	            if(i < (a.length-4)) {
	                answer += "*";
	            } else {
	                answer += a[i];
	            }
	        }
	        return answer;
	    }
}
