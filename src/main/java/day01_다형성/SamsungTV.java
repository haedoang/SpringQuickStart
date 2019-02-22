package day01_다형성;

public class SamsungTV implements TV{


	@Override
	public void powerOn() {
		System.out.println("Samsung-- 전원 킨다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung-- 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsung-- 볼륨 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsung-- 볼륨 내린다.");
	}

}
