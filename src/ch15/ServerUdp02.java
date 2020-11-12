package ch15;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDP통신
/*- TCP소켓 프로그래밍에서는 Socket과 ServerSocket을 사용하지만,
    UDP소켓 프로그래밍에서는 DatagramSocket과 DatagramPacket을 사용.
  - UDP는 연결지향적이지 않으므로 연결요청을 받아줄 서버소켓이 필요없다.
  - DatagramSocket간에 데이터(DatagramPacket)를 주고 받는다.
*/

//데이터를 주로  받는 쪽 => Server역할을 하는 클래스
//					 여기에서는 서버실행 후  10초가  지나면   수신을 종료
public class ServerUdp02 extends Thread {

	public static void main(String[] args) throws Exception {
		DatagramSocket  datagramSocket = new DatagramSocket(7777);
		
		Thread thread = new Thread() {

			@Override
			public void run() {
				System.out.println("[서버입니다: 수신 시작..]");
				
				try {
					while(true) {//수신자는 항상 데이터를 받을 준비가 되어있어야 하므로  반복문을 사용
						/*new DatagramPacket(읽은 패킷 데이터를 저장할 바이트배열,int 읽을 수 있는 최대 바이트수)
							두번째 아규먼트는 첫 번째 배열의 크기와  같거나 또는 작아야한다
							일반적으로   첫 번째 바이트배열의 크기를 준다.*/
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						
						datagramSocket.receive(packet); //DatagramPacket받기
						
						//읽어들인 bytes들을  문자열로 변환
						//byte[]   packet.getData() : Returns the data buffer. The data received or the data to be sent starts from the offset in the buffer, and runs for length long.
						String data = new String( packet.getData(),0, packet.getLength(),"UTF-8");
						
						//콘솔에 출력
						System.out.println("[클라이언트로 부터 받은 내용 : "+data+" ]");	
						
					}//while
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}//run
		};//익명 class
		
		thread.start();  //스레드 시작
		
		Thread.sleep(10000); //10초가 지나면
		datagramSocket.close();
		System.out.println("[서버입니다: 수신 종료.]");

	}//main

}