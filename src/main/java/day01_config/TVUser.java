package day01_config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
//		//1. Spring 컨테이너를 구동한다.
//		AbstractApplicationContext factory = 
//				new GenericXmlApplicationContext("applicationContext.xml");
//		
//		//2. Spring 컨테이너로부터 필요한 객체를 요청(lookup)한다.
//		TV tv = (TV)factory.getBean("tv"); //해당 context.xml 파일에서 bean의 id를 매개변수로 받아서 해당 bean 클래스를 가져온다.
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
//		
//		//3. spring 컨테이너 종료하기
//		factory.close();
//		
//		// class이름으로 등록한 bean 객체 가져오기
//		AbstractApplicationContext factory =
//				new GenericXmlApplicationContext("applicationContext.xml");
//		//class이름에 해당하는 객체가 생성되는것을 확인할 수 있으나, 해당 객체를 사용하기 위해서(lookup)는 식별이 가능한 id가 필요함.
//		
//		TV tv = (TV)factory.getBean("tv"); //lazy-init 설정이 true 인경우 getBean 메소드를 호출한 경우 해당 bean 객체를 생성한다.
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
//		
//		factory.close();
		
		
		//scope 속성 이용하기
		//하나의 객체를 사용하기
		/*
		TV tv1 = new SamsungTV();
		TV tv2 = new SamsungTV();
		TV tv3 = new SamsungTV();  여러개로 생성된 객체를 하나만 생성하려면...
		*/
		
		/*
		TV tv1 = new SamsungTV();
		TV tv2 = tv1;
		TV tv3 = tv2;              같은 객체의 주소를 참조하게 된다.
		*/
		
		//singleton 방식 사용하기.
		//beanFactory lazy-loading 방식. 
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");	
		//SamsungTV 생성자가 1번만 호출된 것을 알 수 있음.
		
		factory.close();
		
	}
}
