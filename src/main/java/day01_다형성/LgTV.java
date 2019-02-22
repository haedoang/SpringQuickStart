package day01_다형성;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV-- 전원켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV-- 전원끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV-- 볼륨올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV-- 볼륨내린다.");
	}

}
