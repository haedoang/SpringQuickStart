package day01_DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory
			= new GenericXmlApplicationContext("applicationContext.xml");
		TV tv =(TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		//Speaker 객체가 volume up down시 마다 계속 생성된다. 
		//Speaker를 교체할 경우 메소드를 수정해야한다. 
		
		//생성자 Injection을 통해 기본 생성자 호출이 이루어지지 않고, constructor-arg에설정한 생성자가 호출된다.

	}
}
