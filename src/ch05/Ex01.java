package ch05;
//array
//같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//많은 양의 값을 다룰 때 유용
//배열의 각 요소는 서로 연속적

public class Ex01 {

	public static void main(String[] args) {
		//데이터타입[] 변수명;    배열변수선언case1
		//데이터타입  변수명[];    배열변수선언case2
		//변수명  = new 데이터타입[크기]; 배열변수타입 따라 자동초기화
		
		int[] score; //선언
		score = new int[3]; //할당 : heap영역에 int타입 데이터 들어갈 공간 확보해줘
							//데이터타입에 따라 자동으로 초기화
							//heap영역에 생긴 주소지를 score 변수에 할당
		//System.out.println(score); score = [I@15db9742
		System.out.println("배열의 크기 = "+score.length );
		
		System.out.println("------------------------");
		//값출력 : 배열변수명[인덱스번호] ->index번호는 0부터 1씩 증가
		for (int i = 0; i < score.length; i++) {
			System.out.println("score"+i+"="+score[i]);
		}
		System.out.println("------------------------");
		//향상된 for문 이용한 출력-교재 p166참고
		//for(int index=0; index<배열의길이; index++){반복실행코드} //기본형태
		//for( 데이터타입 변수명 : 배열명 or 컬렉션명 ){반복실행코드}
		for (int i : score) {
			System.out.println("score"+i+"="+score[i]);
		}
	}
}

