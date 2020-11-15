package test_refactoring;

//해결 1: 매직넘버를 기호상수로 치환
//해결 2: 가드절로 중첩 조건문 치환
//해결 3: 사용자 정의 예외 생성하여 장래의 새로운 에러 통합처리
//해결 4: 가독성 및 활용성 위해 명령어별 개별 method 설정 

public class Ex02_Ref {
	public Ex02_Ref() {}

	public static void main(String[] args) {
		PuppyRobotRef prr = new PuppyRobotRef("max");
		try {
			prr.order(0);
			prr.order(1);
			prr.order(2);
			prr.order(3);
		} catch (CommandException e) {
			if (e.getErrCode()==200) {
				System.out.println("명령어의 범위를 벗어났습니다!");
			}
		} catch(Exception e) {
			System.out.println("입력 형식이 잘못되었습니다!");
		}
	}
}

class PuppyRobotRef{
	private String _name;
	
	static final int COMMAND_EAT = 0;
	static final int COMMAND_STOP = 1;
	static final int COMMAND_JUMP = 2;
	
	public PuppyRobotRef(String name) {
		this._name = name;
	}
	
	public void order(int n) throws CommandException {
		if (n==COMMAND_EAT) {eat(); return;}
		if (n==COMMAND_STOP) {stop(); return;}
		if (n==COMMAND_JUMP) {jump(); return;}
		throw new CommandException("Command input error", 200);
	}
	private void eat() {System.out.println(_name+" eats");}
	private void stop() {System.out.println(_name+" stops");}
	private void jump() {System.out.println(_name+" jumps");}
}

class CommandException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private final int ERR_CODE;
	
	CommandException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	CommandException(String msg) {
		this(msg, 100);
	}
	public int getErrCode() {
		return ERR_CODE;
	}
}