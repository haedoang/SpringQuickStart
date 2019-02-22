package day01_디자인패턴;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("===>samsungTV 생성자 호출");
	}

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
