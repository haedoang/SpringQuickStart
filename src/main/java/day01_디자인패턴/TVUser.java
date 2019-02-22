package day01_디자인패턴;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
	
	//main thread args 사용하여 BeanFactory에 해당하는 객체 생성하기.
	
	
	
	
}
