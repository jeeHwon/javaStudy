package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

//Properties
//내부적으로 
//주로 어플리케이션의 환경설정에 관련된 속성을 저장하는데 
//

//외부의 프로퍼티 파일을 읽어오기
//Properties 객체를 생성하고 load() 메소드를 호출
public class Properties01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		
		//외부의 프로퍼티 파일 경로 지정
		
		//프로퍼티 파일은 일반적으로 클래스 파일과 함께 저장된다
		//클래스파일을 기준으로 상대경로를 이용해서 프로퍼티 파일의 경로를 얻는다
		// => Class.getResource()를 이용
		//클래스명.Class.getResource("database.properties");
		//Properties01.class.getResource("database.properties")
		
		//getResource()는 주어진 파일의 상대경로는 URL 객체로 리턴
		//URL객체로 리턴.getPath() : 파일의 절대 경로를 리턴받기
		String path = Properties01.class.getResource("database.properties").getPath();
		
		//주어진 파일의 경로에 한글이 있는 경우 한글복원
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		//외부의 프로퍼티 파일경로 = C://a/b/database.properties
		//properties.load(new FileReader(외부의 프로퍼티 파일경로));
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		
		System.out.println("driver= "+driver);
		System.out.println("url= "+url);
		System.out.println("user= "+user);
		System.out.println("password= "+password);
		
	}

}
