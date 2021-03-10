package ex04controlstatement;

/*
문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 작성하시오.
단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
출력의결과는 누적되는 모든 수를 콘솔에 print한다.
 */

public class Qu_04_07 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			if(i%3==0 || i%7==0) {
				sum += i;
			}
			else if(i%21==0) {
				sum -= i;
			}
			
			i++; 
		}
		System.out.print(sum);
	}

}