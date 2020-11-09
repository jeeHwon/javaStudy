package ch14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\file01.txt");
		//FileWriter fw = new FileWriter(file);
		//파일이 이미 존재하는 경우 그 파일의 내용을 덮어 쓴다
		FileWriter fw = new FileWriter(file,true);
		//true를 주면 파일 끝에 추가한다
		fw.write("Rachel McAdams\r\n");
		fw.write("12345\r\n");
		fw.write("레이첼 맥아담스");
		fw.flush();
		fw.close();
		
		System.out.println("saved");
		
		
	}

}
