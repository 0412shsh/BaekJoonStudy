package level1;

import java.util.Scanner;

public class ADivB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextInt(); //������ ������������ ������� �Ǽ��� ���ü� �����Ƿ� double ������ ����
		double B = in.nextInt();
		
		System.out.println(A/B);
		in.close();
	}

}
