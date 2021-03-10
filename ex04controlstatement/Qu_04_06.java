package ex04controlstatement;

//문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.

public class Qu_04_06 {

	public static void main(String[] args) {
		
		int s=1;
		while (s<=5) {
			int b=1;
			while(b<=5) {
				if(s==b || s>=b)
					System.out.print("* ");
				else
					System.out.print(" ");
				
				b++;
			}
			System.out.println();
			
			s++;
		}
	}
}
