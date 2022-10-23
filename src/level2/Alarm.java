package level2;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m<45){
			h--;
			//h = h-1;
			m = m+15;
			if(h<0){
				h = h+24;
			}
		} else {
			m = m-45;
		} System.out.println(h+" "+m);
		
	}

}
