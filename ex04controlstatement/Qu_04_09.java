package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		int dan;
		int su;
		
		for(dan = 2; dan <= 9; dan++) {
			for(su = 1; su <= 9; su++) {
				System.out.println(dan + "*" + su + "=" + dan*su);
			}
			System.out.println( );
		}
	}
}
