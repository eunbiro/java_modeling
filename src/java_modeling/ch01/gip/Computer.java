package java_modeling.ch01.gip;

	// 합성 관계
	// 컴퓨터객체 생성 시 다른 모든 객체 생성 > 컴퓨터 삭제시 다른 모든 객체 삭제
public class Computer {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer() {
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
	
	
	
	public static void main (String[] args) {
		Computer computer = new Computer();
			// 컴퓨터만 생성해도 컴퓨터 부품들이 다 생성된다.
		
		computer = null;
			// 메모리 전체가 삭제되면 부품들도 다 삭제된다.
	}
}
