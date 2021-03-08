package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		/*
		char형 : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때
			'(Single quotation)으로 감싸서 표현한다.
			만약 "(Double quotation)으로 감싸면 문자열로 인식하므로
			String형으로 선언해야 한다.
		 */
		char ch1 = '가';
		//char chStr = '가나다라'; => 에러발생] 문자열이므로 char로 선언 불가.
		String chStr = "가나다라";
		System.out.println("ch1="+ch1);
		System.out.println("chStr="+chStr);
		
		/*
		아스키코드 : 1byte로 표현할 수 있는 문자(영문, 숫자)를 십진수로
			정의한 것을 말한다.
			Ex) A => 65로 표현
				a => 97로 표현
		유니코드 : 1byte로 표현이 안되는 문자(한글, 한자 등)를 2byte로
			표현한 것을 말한다. 주로 16진수로 표현.
		 */
		char ch2 = 'A';//65
		int num1 = 2;//2
		int num2 = ch2+num1;//65+2=67
		System.out.println("num2="+num2);//67출력
		System.out.println("(char)num2="+(char)num2);//C출력
		
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=>"+ ch3);
		System.out.println("ch3(아스키코드출력)=>"+(int)ch3);
		
		char ch4='1';//1(문자)_single quotation으로 감쌌으므로 숫자 1이 아닌, 문자 1
		char ch4_1='1'+1;//49+1=50(숫자)
		System.out.println("ch4="+ch4
				+",ch4_1="+ch4_1
				+",ch4_1="+(int)ch4_1);//숫자50 혹은 문자2가 출력됨.
		
		/*
		boolean형 : true 혹은 false 두 가지의 값만 가질 수 있는 자료형으로 산술연산(+,-..)이나
			비교연산(<,>=..)에는 사용할 수 없다.
			단, 논리연산(&&,||)은 가능.
		 */
		boolean bn1=true;
		boolean bn2=false;
		System.out.println("bn1="+bn1+",bn2="+bn2);
		
		/*
		&& : (엠퍼센트) 논리 And 연산으로 양쪽 모두 참일 때 참을 반환한다.
			나머지는 거짓을 반환한다.
		|| : (파이프) 논리 Or 연산으로 둘중 하나만 참이면 참을 반환한다.
			둘다 거짓일때만 거짓을 반환한다.
		 */
		boolean bn3=bn1 && bn2;
		System.out.println("bn3(And)="+bn3); //false 반환
		bn3=bn1||bn2;
		System.out.println("bn3(Or)="+bn3); //true 반환

		bn3='가'>30000; //가(유니코드:44032)이므로 ture 반환
		System.out.println("bn3="+bn3);
	}

}
