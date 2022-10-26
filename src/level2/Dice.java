package level2;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int e;
		int m;
		
		if(a==b && b==c) { 
			e = a;
			m=10000+e*1000;
		} else if (a==b || b==c || a==c){
			e=(a==b)?a:(b==c)?b:c;
			m=1000+e*100;
		} else {
			e=(a>b)?(a>c?a:c):(b>c?b:c);
			m=e*100;
		}System.out.println(m);
	}

}