package ch14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//File 클래스를 이용한 파일 및 디렉토리 정보출력
public class FileEx01 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Temp\\Dir");
		File file1 = new File("C:\\Temp\\file1.txt");
		File file2 = new File("C:\\Temp\\file2.txt");
		File file3 = new File("C:\\Temp\\file3.jpg");
		
		if(!dir.exists()) {dir.mkdirs();}
		if(!file1.exists()) {file1.createNewFile();}
		if(!file2.exists()) {file2.createNewFile();}
		if(!file3.exists()) {file3.createNewFile();}
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		//날짜 시간 형식화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a 	HH:mm");
		
		System.out.println("날짜\t시간\t형태\t크기\t이름");
		System.out.println("==========================");
		for(File f : contents) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			//문서의 마지막 수일이 long으로 길게 나와 보기가 힘드므로
			//보기 편한 형식으로 적용(yyyy~)하기 위하여
			//sdf.format(long)형태가 없으므로
			//sdf.format(date)형태로 바꾸기 위해 Date로 객체 생성해 넣어주는 방법
			if (f.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+f.getName());
			}else {
				System.out.print("\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
			
		}
		
	}

}
