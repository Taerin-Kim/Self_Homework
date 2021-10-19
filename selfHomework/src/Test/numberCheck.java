package Test;

import java.util.Scanner;

public class numberCheck {

	public static void main(String[] args) {
		// String 형태로 입력된 변수 test 의 값이 숫자인지 아닌지 검사하기
		Scanner sc = new Scanner(System.in);

	}

	public boolean isNumber(String test) {
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			// 숫자가 아닐때 중단,
			// 숫자일때는 48~57 사이일때 (아스키코드로 변환)
			if (array[i] < 48 && array[i] > 57) {
				return false;
			}
		}
		return true;
	}

}
