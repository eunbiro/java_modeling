package java_modeling.ch01.gip;

	// 집약 관계
public class Computer2 {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer2(MainBoard mb, CPU c, Memory m, PowerSupply ps) {
		this.mb = mb;
		this.c = c;
		this.m = m;
		this.ps = ps;
	}
	
	
	
	public static void main (String[] args) {
		MainBoard mainBoard = new MainBoard();
		CPU cpu = new CPU();
		Memory memory = new Memory();
		PowerSupply powerSupply = new PowerSupply();
		
		Computer2 computer2 = new Computer2(mainBoard, cpu, memory, powerSupply);
			// 컴퓨터만 생성전에 부품을 만들고 넣어준다.
		
		computer2 = null;
			// 메모리 전체가 삭제되도 부품은 남아있다.
	}
}
