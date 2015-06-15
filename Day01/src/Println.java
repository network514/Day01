public class Println {
	public static void main(String[] args){
	System.out.print("내 나이 : ");
	System.out.println(10); // 숫자는 쌍따옴표 없이 표기 가능하다.
	System.out.print("동생 나이 : ");
	System.out.println(5);
	System.out.print("내 나이와 동생 나이의 합 : ");
	System.out.print("10 + 5 = "); // 쌍따옴표 안은 그림처럼 그대로 화면에 출력된다.(계산 안됨)
	System.out.println(10+5);

	System.out.printf("%d + %d = %d\n", 10, 5, 10+5);

	System.out.print("아버지 나이 :");
	System.out.println(30);
	System.out.println("어머니 나이 : " + 20); // 출력하려는 대상을 + 기호를 이용해서 연속적으로 결합하는 명령할 수 있다.
	System.out.println("강아지 나이 : " + 3 + "살, 고양이 나이 : " + 2 + "살");
	
	System.out.print("강아지 나이 + 고양이나이 : ");
	System.out.print( 3 + 2 );
	System.out.print("강아지 나이 + 고양이나이 : " + 3 + 2);
	System.out.println("" + 3 + 2);
	// 숫자와 숫자에 대한 + 기호를 이용할 때 앞에 "" 형식의 출력 대상이 있으면
	// 뒤에 있는 숫자들을 그림으로 인식한다.
	
	System.out.print("강아지 나이 + 고양이나이 : " + (3 + 2) );
	
	// System.out.println("");
	// 문제 가족의 나이 합
	System.out.println("아버지 나이" + 53 +"세" + "+ 어머니 나이" + 49 +"세" + "+ 내 나이" + 23 +"세" + "동생 나이" + 22 +"세 => ");
	System.out.println("가족나이의 총합은 " + (53+49+23+22) + "세 이다.");
	
	System.out.println("그림 출력 가능");
	System.out.println("10");
	System.out.println("숫자 출력 가능");
	System.out.println(20);
	// 숫자 형태의 20
	System.out.println(12.34); // 소수점 수 가능 : 실수

	System.out.println("한글자 데이터 출력 가능");
	System.out.println('A');
	// 한글자 데이터는 반드시 외따옴표 표기 !!!
	System.out.println('한');

	System.out.println("내 혈액형 : " + 'C' + "형");
	System.out.println("아버지 - 나이 : " + 30 + "살, 키 : " + 178.9 + "cm, 혈액형 : " + 'B' + "형");
	
	}
}