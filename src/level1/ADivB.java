package level1;

import java.util.Scanner;

public class ADivB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextInt(); //정수의 나눗셈이지만 결과값이 실수로 나올수 있으므로 double 형으로 선언
		double B = in.nextInt();
		
		System.out.println(A/B);
		in.close();
	}

}
