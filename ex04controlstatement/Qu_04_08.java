package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {
		for(int hang=1; hang<=5; hang++) {
			for(int yul=1; yul<=5; yul++) {
				if((hang==yul) || (hang<=yul)) 
					System.out.print("* ");
				else
					System.out.print(" ");
			} System.out.println("");
		}
	}
}