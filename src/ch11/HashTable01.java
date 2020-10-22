package ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Hashtable
//철자 주의

//key를 id, value를 비번으로 
//키보드를 이용하여 id, 비번을 입력받아
//Hashtable에 저장되어 있는 id, 비번으로 비교한 후 로그인 여부를 출력

public class HashTable01 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		//객체 저장 -> DB의 테이블에 해아되는 부분
		map.put("spider","peter");
		map.put("super","clark");
		map.put("aqua","arthur");
		map.put("bat","bruce");
		
		//키보드를 이용해서 내용 입력 받기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 비번을 입력하라");
			
			System.out.println("id : ");
			String id = sc.nextLine();
			
			System.out.println("pw : ");
			String pw = sc.nextLine();
			System.out.println("");
			
			//user가 입력한 id가 map에 key로 존재하는지 검색 하고
			//해당키 값의 value를 가져온다(DB 데이터)
			//user가 입력한 비번 2개를 비교해서 일치하면 로그인 성공ㅡ
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패, 비번 확인요망");
				}
			} else {
				System.out.println("해당 아이디가 존재하지않아");
			}
		}
	}
}
