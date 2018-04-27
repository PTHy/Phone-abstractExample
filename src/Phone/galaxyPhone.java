package Phone;

public class galaxyPhone extends Phone{
	
	public galaxyPhone() {}
	
	public galaxyPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("삼성로고 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성로고 끄기");
	}

	@Override
	public void internetSearch() {
		System.out.println("크롬 인터넷 검색");
	}

}
