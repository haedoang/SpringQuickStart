package day01_config;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
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
	
	//init-method 호출하기. 
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리하기.");
	}
	
	//destroy-method 호출하기.
	public void destroyMethod() {
		System.out.println("객체 삭제하기 전에 호출된다.");
	}

}
