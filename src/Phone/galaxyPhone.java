package Phone;

public class galaxyPhone extends Phone{
	
	public galaxyPhone() {}
	
	public galaxyPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("�Ｚ�ΰ� �ѱ�");
	}

	@Override
	public void turnOff() {
		System.out.println("�Ｚ�ΰ� ����");
	}

	@Override
	public void internetSearch() {
		System.out.println("ũ�� ���ͳ� �˻�");
	}

}
