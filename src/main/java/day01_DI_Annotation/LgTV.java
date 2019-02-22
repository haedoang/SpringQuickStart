package day01_DI_Annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//@Component("tv")
@Component
public class LgTV implements TV{

	/*@Autowired
	@Qualifier("apple")			//객체 자동주입 시 qualifier로 지정할 수 있음.
	
*/	
	@Resource(name="apple")
	private Speaker speaker;  //setSpeaker 메소드가 필요없다. 
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
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
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
