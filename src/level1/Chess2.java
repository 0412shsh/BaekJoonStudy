package level1;

import java.util.Scanner;

public class Chess2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] full = {1,1,2,2,2,8};  //�迭�� �⺻ ü���� ���� ���� 
		for (int i=0; i<6; i++){      //for������ 0���� 5���� ���� 
			System.out.println(full[i]-sc.nextInt()+" ");  //�迭�� ����� �� - ���� ü���� �ִ� �� (-)
		}
				
		
		
		
	}

}
