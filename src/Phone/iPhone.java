package Phone;

public class iPhone extends Phone{
	
	public iPhone() {}
	
	public iPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("���� �ΰ� �ѱ�");
	}

	@Override
	public void turnOff() {
		System.out.println("���� �ΰ� ����");
	}

	@Override
	public void internetSearch() {
		System.out.println("���ĸ� ���ͳݰ˻�");
	}

}
