package day01_DI_setterInjection;

public class SamsungTV implements TV{

	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
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
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	
	
	//setter Injection 
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	
	


}
