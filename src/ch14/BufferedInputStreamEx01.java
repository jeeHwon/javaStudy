package ch14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferedInputStream과 BufferedOutputStream : 성능향상 보조스트림
//버퍼를 사용했을 떄의 성능 비교
public class BufferedInputStreamEx01 {

	public static void main(String[] args) throws IOException {
		//버퍼보조스트림 일부사용시
		FileInputStream fis1 = new FileInputStream("C:\\Temp\\test1.jpg");
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		FileOutputStream fos1 = new FileOutputStream("C:\\Temp\\test1_copy.jpg");
		
		int data = -1;
		long start = 0;	//시작시간
		long end = 0;	//종료시간
		
		start = System.currentTimeMillis();	//시작시간 얻기
		while ((data = bis1.read())!=-1) {
			System.out.println(data);
			fos1.write(data);
		}
		fos1.flush();
		end = System.currentTimeMillis();	//종료시간 얻기
		
		fos1.close();
		bis1.close();
		fis1.close();
		System.out.println("버퍼보조스트림 일부사용_경과시간 : "+(end-start)+"ms");
		
		//public class BufferedInputSteram extends FiterInputStream
		//new BufferedInputStream(InputStream in)
		//버퍼보조스트림 버퍼사용시
		FileInputStream fis2 = new FileInputStream("C:\\Temp\\test2.jpg");
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\test2_copy.jpg");
		BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
		
		start = System.currentTimeMillis();	//시작시간 얻기
		while ((data = bis2.read())!=-1) {
			bos2.write(data);
			
		}
		bos2.flush();
		end = System.currentTimeMillis();	//종료시간 얻기
		bos2.close();
		fos2.close();
		bis2.close();
		fis2.close();
		System.out.println("버퍼보조스트림 사용_경과시간 : "+(end-start)+"ms");
		
		
	}

}
