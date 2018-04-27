package Phone;

public class iPhone extends Phone{
	
	public iPhone() {}
	
	public iPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("애플 로고 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("애플 로고 끄기");
	}

	@Override
	public void internetSearch() {
		System.out.println("사파리 인터넷검색");
	}

}
