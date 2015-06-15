public class Println2 {
	public static void man(String[] args){
		System.out.println("1분 : " + 60 + "초");
		System.out.println("2분 : " + (60*2) + "초");
		System.out.println("3분 : " + 60*3 + "초");
		// + 기호보다 연산 우선순위가 높은 *(곱하기), /(나눈 몫) 기호는 소괄호가 없어도 연산 가능.
		
		System.out.println("3분 : " + 60*3 + "초");

		// 에러 :
		// System.out.println("5 - 2 : " + 5 - 2);
		
		// + 기호와 동등한 우선순위를 가진 - 기호는 소괄호 없이는 사용 불가능.
		System.out.println(5-2+"분");
		// "" 그림 앞 쪽에 연산식이 있으면 이 때에는 소괄호 없이도 계산 가능
		System.out.println(10 + 5 + "와 " + 10 + 5);
		// 쌍따옴표 앞 쪽의 연산식은 계산되지만 뒤쪽의 연산식은 소괄호가 없는 상태에서는 
		// 그림처리 된다. 
	}
}