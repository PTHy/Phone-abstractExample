package Phone;

public class PhoneExample {
	public static void main(String[] args) {
		iPhone iPhone8 = new iPhone("ȫ�浿");
		iPhone8.turnOn();			iPhone8.internetSearch();
		System.out.println("-----------");
		galaxyPhone galaxy9 = new galaxyPhone("�Ӳ���");
		galaxy9.turnOn();			galaxy9.internetSearch();
		System.out.println("-----------");
		Phone phone = null;
		phone = new iPhone();		phone.turnOn();
		System.out.println("-----------");
		phoneInternetSearch(new galaxyPhone());
		phoneInternetSearch(new iPhone());
		iPhone8.turnOff();          galaxy9.turnOff();
	}
	private static void phoneInternetSearch(Phone phone) {
		phone.internetSearch();
	}
}
