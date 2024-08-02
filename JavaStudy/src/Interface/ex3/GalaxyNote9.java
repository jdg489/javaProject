package Interface.ex3;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	public GalaxyNote9() {
		super();
		this.setMake("삼성");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식 와콤펜 지원";
	}
	public boolean bluetoothPen() {
		return true;
	}
	public String printlnformation() {
		String result = "";
		result += ("갤럭시 노트9은" + this.getMaker() +"갤럭시노트9은 삼성에서 만들어졌고 제원은 다음과 같다.");
		result += (this.makeCall() + "\n");
		result += (this.takeCall() + "\n");
		result += (this.picture() + "\n");
		result += (this.charge() + "\n");
		result += (this.touch() + "\n");
		result += (this.bluetoothPen() + "\n");
		return result;
	}
}
