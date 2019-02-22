package day01_높은결합도;

public class TVUser {
	public static void main(String[] args) {
		
		//결합도가 높은 프로그램.
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		System.out.println("-----------------------");
		LgTV tv2 = new LgTV();
		tv2.turnOn();
		tv2.turnOff();
		tv2.soundUp();
		tv2.soundDown();
		
		
		//SamsungTV LgTV로 교체할 경우 객체 자체를 수정해야하기 때문에 결합도가 높아 유지보수가 어렵다.
	}
}
