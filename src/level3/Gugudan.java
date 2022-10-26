package level3;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g =0;
		int n = sc.nextInt();
		for(int i=1;i<10;i++){
			g = n*i;
			System.out.println(n+" * "+i+" = "+g);
		} 
	}

}
