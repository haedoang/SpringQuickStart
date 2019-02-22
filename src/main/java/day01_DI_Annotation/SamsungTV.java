package day01_DI_Annotation;

public class SamsungTV implements TV{
	//SonySpeaker 참조..
	//private SonySpeaker speaker;
	//Speaker 교체를 위한 interface참조하기
	private Speaker speaker;
	private int price;
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	//Constructor Injection을 위해 생성자 추가하기.
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	//다수 변수 매핑하기
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	@Override
	public void powerOn() {
		//System.out.println("Samsung-- 전원 킨다.");
		System.out.println("SamsungTV-- 전원켠다. (가격: " + price + ")");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung-- 전원 끈다.");
	}
	
	/*@Override
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}*/
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}



}
