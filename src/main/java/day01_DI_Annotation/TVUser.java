package day01_DI_Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		//component-scan을 통해 Component 클래스를 읽어 들인다.
		
		//component에 id나 name을 통해 해당 클래스를 사용한다.
		//TV tv = (TV)factory.getBean("tv");
		//id name 지정안할 시 해당 bean의 클래스명 첫글자를소문자로 한 이름이 자동설정된다.
		TV tv = (TV)factory.getBean("lgTV");
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
		factory.close();
	}
}
