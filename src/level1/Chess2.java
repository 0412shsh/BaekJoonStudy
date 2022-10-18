package level1;

import java.util.Scanner;

public class Chess2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] full = {1,1,2,2,2,8};  //배열에 기본 체스말 개수 저장 
		for (int i=0; i<6; i++){      //for문으로 0부터 5까지 돌며 
			System.out.println(full[i]-sc.nextInt()+" ");  //배열에 저장된 값 - 실제 체스말 있는 값 (-)
		}
				
		
		
		
	}

}
